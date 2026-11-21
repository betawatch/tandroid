package org.telegram.utils.twidget;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipFile;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public class WidgetEngineService extends Service {
    public static volatile String b;
    public static String c;
    public static final ExecutorService d = Executors.newSingleThreadExecutor(new ai.a1(6));
    public static volatile boolean e;
    public final a0 a = new a0(this);

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public static final class Forked extends WidgetEngineService {
    }

    public static byte[] a(q qVar, String str) {
        if (str.contains("..") || str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid bundle path");
        }
        InputStream b10 = qVar.b("WidgetJS/".concat(str));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[TLObject.FLAG_14];
            while (true) {
                int read = b10.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    b10.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            if (b10 != null) {
                try {
                    b10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static boolean b() {
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
                    int i7 = 0;
                    while (i7 < Math.max(0, read) && bArr[i7] != 0) {
                        i7++;
                    }
                    String str2 = new String(bArr, 0, i7, StandardCharsets.UTF_8);
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

    public static void c(String str) {
        SystemClock.uptimeMillis();
        if (!WidgetSandboxNative.available()) {
            throw new IllegalStateException("libtwidget is missing");
        }
        ZipFile zipFile = new ZipFile(str);
        try {
            d(new q(zipFile, 2));
            zipFile.close();
            String[] strArr = {"WidgetEngineBackend", "WidgetSandboxBackend", "WidgetSandboxIntl", "WidgetPng", "IWidgetEngine$Stub", "IWidgetEngineCallback$Stub$Proxy"};
            for (int i7 = 0; i7 < 6; i7++) {
                try {
                    Class.forName("org.telegram.utils.twidget." + strArr[i7]);
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static synchronized String d(q qVar) {
        String[] strArr;
        int i7;
        q qVar2 = qVar;
        synchronized (WidgetEngineService.class) {
            try {
                String str = c;
                if (str != null) {
                    return str;
                }
                try {
                    try {
                        InputStream b10 = qVar2.b("manifest.txt");
                        try {
                            String a10 = i1.a(b10);
                            b10.close();
                            String[] split = a10.split("\n");
                            int length = split.length;
                            byte[] bArr = null;
                            byte[] bArr2 = null;
                            byte[] bArr3 = null;
                            byte[] bArr4 = null;
                            byte[] bArr5 = null;
                            int i10 = 0;
                            while (i10 < length) {
                                String str2 = split[i10];
                                if (!str2.isEmpty()) {
                                    String[] split2 = str2.split(" ", 2);
                                    byte[] a11 = a(qVar2, split2[1]);
                                    StringBuilder sb2 = new StringBuilder();
                                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(a11);
                                    int length2 = digest.length;
                                    int i11 = 0;
                                    while (i11 < length2) {
                                        int i12 = i11;
                                        sb2.append(String.format("%02x", Integer.valueOf(digest[i12] & 255)));
                                        i11 = i12 + 1;
                                        split = split;
                                        length = length;
                                    }
                                    strArr = split;
                                    i7 = length;
                                    if (!split2[0].equals(sb2.toString())) {
                                        throw new IllegalStateException("Bundle checksum mismatch: " + split2[1]);
                                    }
                                    String str3 = split2[1];
                                    switch (str3.hashCode()) {
                                        case -1927203231:
                                            if (str3.equals("validator-bundle.qbc")) {
                                                bArr5 = a11;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -1818708305:
                                            if (str3.equals("sandbox-bundle.js")) {
                                                bArr = a11;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -1529025109:
                                            if (str3.equals("renderer-bundle.js")) {
                                                bArr3 = a11;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -754904710:
                                            if (str3.equals("validator-bundle.js")) {
                                                bArr2 = a11;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -545376308:
                                            if (str3.equals("sandbox-bundle.qbc")) {
                                                bArr4 = a11;
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else {
                                    strArr = split;
                                    i7 = length;
                                }
                                i10++;
                                qVar2 = qVar;
                                split = strArr;
                                length = i7;
                            }
                            if (bArr == null || bArr2 == null) {
                                throw new IllegalStateException("Widget bundles are missing");
                            }
                            byte[] digest2 = MessageDigest.getInstance("SHA-256").digest(a10.getBytes(StandardCharsets.UTF_8));
                            StringBuilder sb3 = new StringBuilder("assets:");
                            for (int i13 = 0; i13 < 12; i13++) {
                                sb3.append(String.format("%02x", Integer.valueOf(digest2[i13] & 255)));
                            }
                            WidgetSandboxNative.registerResources(sb3.toString().getBytes(StandardCharsets.UTF_8), bArr, bArr2, bArr3, bArr4, bArr5);
                            String sb4 = sb3.toString();
                            c = sb4;
                            return sb4;
                        } finally {
                        }
                    } catch (RuntimeException e10) {
                        throw e10;
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException("Widget bundles: " + e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static native int installSeccomp(boolean z10, boolean z11);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemClock.uptimeMillis();
        if (!WidgetSandboxNative.available()) {
            throw new IllegalStateException("libtwidget is missing");
        }
        SystemClock.uptimeMillis();
        int installSeccomp = installSeccomp(true, false);
        if (installSeccomp == 0) {
            return;
        }
        if (installSeccomp == OsConstants.ENOSYS || installSeccomp == OsConstants.EINVAL) {
            e = true;
            Log.e("WidgetEngine", "no seccomp filter in this kernel (errno " + installSeccomp + "): the engine makes no session");
            return;
        }
        Log.e("WidgetEngine", "seccomp filter refused (errno " + installSeccomp + "): the engine does not start");
        Process.killProcess(Process.myPid());
    }
}
