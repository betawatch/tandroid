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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class WidgetEngineService extends Service {
    public static volatile String b;
    public static String c;
    public static final ExecutorService d = Executors.newSingleThreadExecutor(new ai.y0(6));
    public static volatile boolean e;
    public final a0 a = new a0(this);

    /* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        long uptimeMillis = SystemClock.uptimeMillis();
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
            Log.i("WidgetEngine", "app zygote: library and bundles in " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
        } finally {
        }
    }

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
                    InputStream b10 = qVar2.b("manifest.txt");
                    try {
                        String a10 = i1.a(b10);
                        b10.close();
                        String[] split = a10.split("\n");
                        int length = split.length;
                        byte[] bArr = null;
                        byte[] bArr2 = null;
                        byte[] bArr3 = null;
                        int i10 = 0;
                        while (i10 < length) {
                            String str2 = split[i10];
                            if (str2.isEmpty()) {
                                strArr = split;
                                i7 = length;
                            } else {
                                String[] split2 = str2.split(" ", 2);
                                byte[] a11 = a(qVar2, split2[1]);
                                StringBuilder sb2 = new StringBuilder();
                                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a11);
                                int length2 = digest.length;
                                int i11 = 0;
                                while (i11 < length2) {
                                    sb2.append(String.format("%02x", Integer.valueOf(digest[i11] & 255)));
                                    i11++;
                                    split = split;
                                    length = length;
                                }
                                strArr = split;
                                i7 = length;
                                if (!split2[0].equals(sb2.toString())) {
                                    throw new IllegalStateException("Bundle checksum mismatch: " + split2[1]);
                                }
                                String str3 = split2[1];
                                int hashCode = str3.hashCode();
                                if (hashCode != -1818708305) {
                                    if (hashCode != -1529025109) {
                                        if (hashCode == -754904710 && str3.equals("validator-bundle.js")) {
                                            bArr2 = a11;
                                        }
                                    } else if (str3.equals("renderer-bundle.js")) {
                                        bArr3 = a11;
                                    }
                                } else if (str3.equals("sandbox-bundle.js")) {
                                    bArr = a11;
                                }
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
                        for (int i12 = 0; i12 < 12; i12++) {
                            sb3.append(String.format("%02x", Integer.valueOf(digest2[i12] & 255)));
                        }
                        WidgetSandboxNative.registerResources(sb3.toString().getBytes(StandardCharsets.UTF_8), bArr, bArr2, bArr3);
                        String sb4 = sb3.toString();
                        c = sb4;
                        return sb4;
                    } finally {
                    }
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IllegalStateException("Widget bundles: " + e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static native int installSeccomp(boolean z10);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!WidgetSandboxNative.available()) {
            throw new IllegalStateException("libtwidget is missing");
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        int installSeccomp = installSeccomp(true);
        if (installSeccomp == 0) {
            StringBuilder sb2 = new StringBuilder("engine up: ");
            sb2.append(Build.VERSION.SDK_INT >= 24 ? uptimeMillis - Process.getStartUptimeMillis() : -1L);
            sb2.append(" ms from fork to onCreate, library ");
            sb2.append(uptimeMillis2);
            sb2.append(" ms, seccomp ");
            sb2.append((SystemClock.uptimeMillis() - uptimeMillis) - uptimeMillis2);
            sb2.append(" ms");
            sb2.append(c != null ? ", bundles from the app zygote" : "");
            Log.i("WidgetEngine", sb2.toString());
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
