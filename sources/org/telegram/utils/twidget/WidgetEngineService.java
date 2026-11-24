package org.telegram.utils.twidget;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Debug;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.system.OsConstants;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class WidgetEngineService extends Service {
    public static volatile String b;
    public static String c;
    public static final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new x20((byte) 11));
    public static volatile boolean e;
    public static boolean f;
    public static volatile boolean h;
    public final n a = new n(this);

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public static final class Forked extends WidgetEngineService {
    }

    public static byte[] c(dkc dkcVar, String str) {
        if (str.contains("..") || str.startsWith("/")) {
            w26.j("Invalid bundle path");
            return null;
        }
        InputStream b2 = dkcVar.b("WidgetJS/".concat(str));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[TLObject.FLAG_14];
            while (true) {
                int read = b2.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    b2.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            if (b2 != null) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 28 && Process.isIsolated()) {
            return true;
        }
        String str = b;
        if (str == null) {
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
                try {
                    byte[] bArr = new byte[256];
                    int read = fileInputStream.read(bArr);
                    int i = 0;
                    while (i < Math.max(0, read) && bArr[i] != 0) {
                        i++;
                    }
                    String str2 = new String(bArr, 0, i, StandardCharsets.UTF_8);
                    fileInputStream.close();
                    str = str2;
                } finally {
                }
            } catch (Exception unused) {
                str = "";
            }
            b = str;
        }
        return str.contains(":widgets");
    }

    public static void e(String str) {
        SystemClock.uptimeMillis();
        if (!WidgetSandboxNative.available()) {
            sc8.j("libtwidget is missing");
            return;
        }
        ZipFile zipFile = new ZipFile(str);
        try {
            f(new dkc(zipFile, (byte) 7));
            zipFile.close();
            String[] strArr = {"WidgetEngineBackend", "WidgetSandboxBackend", "WidgetSandboxIntl", "WidgetPng", "IWidgetEngine$Stub", "IWidgetEngineCallback$Stub$Proxy"};
            for (int i = 0; i < 6; i++) {
                try {
                    Class.forName("org.telegram.utils.twidget." + strArr[i]);
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void exitNow(int i);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static synchronized String f(dkc dkcVar) {
        String[] strArr;
        int i;
        dkc dkcVar2 = dkcVar;
        synchronized (WidgetEngineService.class) {
            String str = c;
            if (str != null) {
                return str;
            }
            try {
                try {
                    InputStream b2 = dkcVar2.b("manifest.txt");
                    try {
                        String a = hwc.a(b2);
                        b2.close();
                        String[] split = a.split("\n");
                        int length = split.length;
                        byte[] bArr = null;
                        byte[] bArr2 = null;
                        byte[] bArr3 = null;
                        byte[] bArr4 = null;
                        byte[] bArr5 = null;
                        int i2 = 0;
                        while (i2 < length) {
                            String str2 = split[i2];
                            if (!str2.isEmpty()) {
                                String[] split2 = str2.split(" ", 2);
                                byte[] c2 = c(dkcVar2, split2[1]);
                                StringBuilder sb = new StringBuilder();
                                byte[] digest = MessageDigest.getInstance("SHA-256").digest(c2);
                                int length2 = digest.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    int i4 = i3;
                                    sb.append(String.format("%02x", Integer.valueOf(digest[i4] & 255)));
                                    i3 = i4 + 1;
                                    split = split;
                                    length = length;
                                }
                                strArr = split;
                                i = length;
                                if (!split2[0].equals(sb.toString())) {
                                    throw new IllegalStateException("Bundle checksum mismatch: " + split2[1]);
                                }
                                String str3 = split2[1];
                                switch (str3.hashCode()) {
                                    case -1927203231:
                                        if (str3.equals("validator-bundle.qbc")) {
                                            bArr5 = c2;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1818708305:
                                        if (str3.equals("sandbox-bundle.js")) {
                                            bArr = c2;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1529025109:
                                        if (str3.equals("renderer-bundle.js")) {
                                            bArr3 = c2;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -754904710:
                                        if (str3.equals("validator-bundle.js")) {
                                            bArr2 = c2;
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -545376308:
                                        if (str3.equals("sandbox-bundle.qbc")) {
                                            bArr4 = c2;
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                strArr = split;
                                i = length;
                            }
                            i2++;
                            dkcVar2 = dkcVar;
                            split = strArr;
                            length = i;
                        }
                        if (bArr == null || bArr2 == null) {
                            throw new IllegalStateException("Widget bundles are missing");
                        }
                        byte[] digest2 = MessageDigest.getInstance("SHA-256").digest(a.getBytes(StandardCharsets.UTF_8));
                        StringBuilder sb2 = new StringBuilder("assets:");
                        for (int i5 = 0; i5 < 12; i5++) {
                            sb2.append(String.format("%02x", Integer.valueOf(digest2[i5] & 255)));
                        }
                        WidgetSandboxNative.registerResources(sb2.toString().getBytes(StandardCharsets.UTF_8), bArr, bArr2, bArr3, bArr4, bArr5);
                        String sb3 = sb2.toString();
                        c = sb3;
                        return sb3;
                    } finally {
                    }
                } catch (Exception e2) {
                    throw new IllegalStateException("Widget bundles: " + e2);
                }
            } catch (RuntimeException e3) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void fileGate(IBinder iBinder);

    private static native int installSeccomp(boolean z, boolean z2, boolean z3, int i);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        boolean z = Build.VERSION.SDK_INT < 29 || intent.getBooleanExtra("shared", true);
        AssetManager assets = getAssets();
        synchronized (WidgetEngineService.class) {
            if (!f) {
                f = true;
                h = !z;
                SystemClock.uptimeMillis();
                odd.a();
                d.prestartCoreThread();
                try {
                    f(new dkc(assets, (byte) 8));
                } catch (RuntimeException e2) {
                    Log.e("WidgetEngine", "bundles", e2);
                }
                Debug.getNativeHeapAllocatedSize();
                SystemClock.uptimeMillis();
                if (!z) {
                    WidgetSandboxNative.reserveThreads(21);
                }
                SystemClock.uptimeMillis();
                int installSeccomp = installSeccomp(true, false, z, Build.VERSION.SDK_INT);
                if (installSeccomp != 0) {
                    if (installSeccomp == OsConstants.ENOSYS || installSeccomp == OsConstants.EINVAL) {
                        e = true;
                        Log.e("WidgetEngine", "no seccomp filter in this kernel (errno " + installSeccomp + "): the engine makes no session");
                    } else {
                        Log.e("WidgetEngine", "seccomp filter refused (errno " + installSeccomp + "): the engine does not start");
                        Process.killProcess(Process.myPid());
                    }
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemClock.uptimeMillis();
        if (WidgetSandboxNative.available()) {
            SystemClock.uptimeMillis();
        } else {
            sc8.j("libtwidget is missing");
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (h) {
            exitNow(0);
        }
        return false;
    }
}
