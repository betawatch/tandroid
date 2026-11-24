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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class WidgetEngineService extends Service {
    public static volatile String b;
    public static String c;
    public static final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new x20((byte) 11));
    public static volatile boolean e;
    public static boolean f;
    public static volatile boolean h;
    public final n a = new n(this);

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                        int i2 = 0;
                        while (i2 < length) {
                            String str2 = split[i2];
                            if (str2.isEmpty()) {
                                strArr = split;
                                i = length;
                            } else {
                                String[] split2 = str2.split(" ", 2);
                                byte[] c2 = c(dkcVar2, split2[1]);
                                StringBuilder sb = new StringBuilder();
                                byte[] digest = MessageDigest.getInstance("SHA-256").digest(c2);
                                int length2 = digest.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    sb.append(String.format("%02x", Integer.valueOf(digest[i3] & 255)));
                                    i3++;
                                    split = split;
                                    length = length;
                                }
                                strArr = split;
                                i = length;
                                if (!split2[0].equals(sb.toString())) {
                                    throw new IllegalStateException("Bundle checksum mismatch: " + split2[1]);
                                }
                                String str3 = split2[1];
                                int hashCode = str3.hashCode();
                                if (hashCode != -1818708305) {
                                    if (hashCode != -1529025109) {
                                        if (hashCode == -754904710 && str3.equals("validator-bundle.js")) {
                                            bArr2 = c2;
                                        }
                                    } else if (str3.equals("renderer-bundle.js")) {
                                        bArr3 = c2;
                                    }
                                } else if (str3.equals("sandbox-bundle.js")) {
                                    bArr = c2;
                                }
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
                        for (int i4 = 0; i4 < 12; i4++) {
                            sb2.append(String.format("%02x", Integer.valueOf(digest2[i4] & 255)));
                        }
                        WidgetSandboxNative.registerResources(sb2.toString().getBytes(StandardCharsets.UTF_8), bArr, bArr2, bArr3);
                        String sb3 = sb2.toString();
                        c = sb3;
                        return sb3;
                    } finally {
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Widget bundles: " + e3);
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
