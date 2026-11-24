// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s34 implements ts4 {
    public static HashMap E;
    public static final String[] e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] f = {"goldfish"};
    public static final String[] h = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] n = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] r = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] s = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final String[] w = {"/Android/data/com.bluestacks.home", "/Android/data/com.bluestacks.settings"};
    public static final i5[] x;
    public static s34 y;
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    static {
        String str = null;
        String str2 = "unknown";
        String str3 = "sdk";
        x = new i5[]{new i5("init.svc.qemud", str), new i5("init.svc.qemu-props", str), new i5("qemu.hw.mainkeys", str), new i5("qemu.sf.fake_camera", str), new i5("qemu.sf.lcd_density", str), new i5("ro.bootloader", str2), new i5("ro.bootmode", str2), new i5("ro.hardware", "goldfish"), new i5("ro.kernel.android.qemud", str), new i5("ro.kernel.qemu.gles", str), new i5("ro.kernel.qemu", "1"), new i5("ro.product.device", "generic"), new i5("ro.product.model", str3), new i5("ro.product.name", str3), new i5("ro.serialno", null)};
    }

    public s34() {
        this.c = new Path();
        this.d = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d() {
        boolean z;
        boolean z2 = false;
        if (!Build.BOARD.toLowerCase().contains("nox") && !Build.BOOTLOADER.toLowerCase().contains("nox") && !Build.FINGERPRINT.startsWith("generic")) {
            String str = Build.MODEL;
            if (!str.toLowerCase().contains("google_sdk") && !str.toLowerCase().contains("droid4x") && !str.toLowerCase().contains("emulator") && !str.contains("Android SDK built for x86") && !Build.MANUFACTURER.toLowerCase().contains("genymotion")) {
                String str2 = Build.HARDWARE;
                if (!str2.toLowerCase().contains("goldfish") && !str2.toLowerCase().contains("vbox86") && !str2.toLowerCase().contains("android_x86") && !str2.toLowerCase().contains("nox") && !str2.toLowerCase().contains("ranchu")) {
                    String str3 = Build.PRODUCT;
                    if (!str3.equals("sdk") && !str3.equals("google_sdk") && !str3.equals("sdk_x86") && !str3.equals("vbox86p") && !str3.toLowerCase().contains("nox") && !Build.SERIAL.toLowerCase().contains("nox")) {
                        z = false;
                        if (!z) {
                            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                                z2 = true;
                            }
                            boolean z3 = z | z2;
                            if (!z3) {
                                return z3 | "google_sdk".equals(Build.PRODUCT);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        return true;
    }

    public static s34 m(Context context) {
        if (context == null) {
            u36.j("Context must not be null.");
            return null;
        }
        s34 s34Var = y;
        if (s34Var != null) {
            return s34Var;
        }
        Context applicationContext = context.getApplicationContext();
        s34 s34Var2 = new s34();
        ArrayList arrayList = new ArrayList();
        s34Var2.d = arrayList;
        s34Var2.c = applicationContext;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
        y = s34Var2;
        return s34Var2;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        i();
    }

    public final boolean b(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z = this.b;
        yv1 yv1Var = (yv1) this.d;
        ArrayList arrayList = yv1Var.M6;
        int i2 = i - yv1Var.D0.K;
        if (i2 < 0 || i2 >= arrayList.size()) {
            return false;
        }
        k47 k47Var = (k47) arrayList.get(i2);
        if (k47Var.U == 0) {
            return !z ? sparseArray.get(k47Var.e1(), null) == null : sparseArray.get(k47Var.e1(), null) != null;
        }
        return false;
    }

    public final boolean c() {
        String str;
        Context context = (Context) this.c;
        rs.b(context, "android.permission.READ_PHONE_STATE");
        if (e(1, e) || e(2, r) || e(3, s) || e(4, w)) {
            return true;
        }
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (new String(bArr).contains(f[0])) {
                    return true;
                }
            }
        }
        if (e(5, h)) {
            return true;
        }
        if (rs.b(context, "android.permission.INTERNET") == 0) {
            String[] strArr = {"/system/bin/netcfg"};
            StringBuilder sb = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File("/system/bin/"));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr2 = new byte[1024];
                while (inputStream.read(bArr2) != -1) {
                    sb.append(new String(bArr2));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                for (String str2 : sb2.split("\n")) {
                    if ((str2.contains("wlan0") || str2.contains("tunl0") || str2.contains("eth0")) && str2.contains("10.0.2.15")) {
                        return true;
                    }
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 15; i3++) {
            i5 i5Var = x[i3];
            String str3 = i5Var.a;
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str3);
            } catch (Exception unused2) {
                str = null;
            }
            String str4 = i5Var.b;
            if (str4 == null && str != null) {
                i2++;
            }
            if (str4 != null && str.contains(str4)) {
                i2++;
            }
        }
        return i2 >= 5 && e(6, n);
    }

    public final boolean e(int i, String[] strArr) {
        File file;
        for (String str : strArr) {
            if (rs.b((Context) this.c, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                file = new File(str);
            } else if ((str.contains("/") && i == 3) || i == 4) {
                file = new File(Environment.getExternalStorageDirectory() + str);
            } else {
                file = new File(str);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.a) {
            return;
        }
        this.a = true;
        qn4 qn4Var = (qn4) this.c;
        if (qn4Var != null) {
            qn4Var.run();
        }
        c25 c25Var = (c25) this.d;
        if (c25Var == null || this.b) {
            return;
        }
        c25Var.run();
    }

    public final void g() {
        if (this.a) {
            this.a = false;
            i();
        }
    }

    public final boolean h() {
        if (this.a) {
            return this.b;
        }
        boolean z = true;
        try {
            this.a = true;
            boolean z2 = this.b;
            if (!z2) {
                z2 = d();
                this.b = z2;
            }
            if (!z2) {
                z2 = c();
                this.b = z2;
            }
            if (!z2) {
                ArrayList arrayList = (ArrayList) this.d;
                if (!arrayList.isEmpty()) {
                    PackageManager packageManager = ((Context) this.c).getPackageManager();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                            break;
                        }
                    }
                }
                z = false;
                this.b = z;
                z2 = z;
            }
            if (z2) {
                return z2;
            }
            boolean a = vad.a();
            this.b = a;
            return a;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void i() {
        boolean z = this.a && ((kk4) this.d).run();
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            Window window = (Window) this.c;
            HashMap hashMap = E;
            if (hashMap == null) {
                hashMap = new HashMap();
                E = hashMap;
            }
            Integer num = (Integer) hashMap.get(window);
            int max = Math.max(0, (num == null ? 0 : num.intValue()) + i);
            HashMap hashMap2 = E;
            if (max <= 0) {
                hashMap2.remove(window);
            } else {
                hashMap2.put(window, Integer.valueOf(max));
            }
            if (window != null) {
                HashMap hashMap3 = E;
                if (hashMap3 == null || hashMap3.get(window) == null) {
                    window.clearFlags(TLObject.FLAG_13);
                    gm.f2();
                } else {
                    window.addFlags(TLObject.FLAG_13);
                    gm.f2();
                }
            }
        }
    }

    public final boolean k(Rect rect, boolean z, boolean z2) {
        Rect rect2 = (Rect) this.d;
        boolean z3 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z2 && this.b == z && z2 && z) ? false : true;
        this.a = z2;
        this.b = z;
        rect2.set(rect);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float f2, float f3, int i, boolean z) {
        u69 K;
        yv1 yv1Var = (yv1) this.d;
        ArrayList arrayList = yv1Var.M6;
        SparseArray[] sparseArrayArr = yv1Var.o6;
        int i2 = i - yv1Var.D0.K;
        if (this.b) {
            z = !z;
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        k47 k47Var = (k47) arrayList.get(i2);
        if (z) {
            if (sparseArrayArr[0].indexOfKey(k47Var.e1()) >= 0 || sparseArrayArr[1].indexOfKey(k47Var.e1()) >= 0) {
                return;
            }
        } else if (sparseArrayArr[0].indexOfKey(k47Var.e1()) < 0 && sparseArrayArr[1].indexOfKey(k47Var.e1()) < 0) {
            return;
        }
        if (k47Var.U == 0) {
            if (z) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                    this.a = true;
                    K = yv1Var.A0.K(i);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof rc2) {
                            yv1Var.Ra(view, f2, f3, false);
                            return;
                        }
                    }
                    yv1Var.D4(k47Var, false, true);
                    yv1Var.Kc();
                    yv1Var.Gd(false);
                }
            }
            this.a = false;
            K = yv1Var.A0.K(i);
            if (K != null) {
            }
            yv1Var.D4(k47Var, false, true);
            yv1Var.Kc();
            yv1Var.Gd(false);
        }
    }

    @Override // ts4
    public final void onSuccess(Object obj) {
        tw6 tw6Var = (tw6) obj;
        tx6 tx6Var = ((ly6) this.d).j;
        hy6 hy6Var = new hy6(this, tw6Var, this.a, this.b, (sw6) this.c, (byte) 0);
        tx6Var.getClass();
        hy6Var.run();
    }

    public s34(qn4 qn4Var, c25 c25Var) {
        this.c = qn4Var;
        this.d = c25Var;
    }

    public s34(Window window, kk4 kk4Var) {
        this.a = false;
        this.b = false;
        this.c = window;
        this.d = kk4Var;
    }

    @Override // ts4
    public final void j(Throwable th) {
    }
}
