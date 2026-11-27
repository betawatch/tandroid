// default package

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class xve {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        lq5.j(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        iy8.d();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            qu6.u(sb, "Must be called on ", name2, " thread, but got ", name);
            grb.k(sb, ".");
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        grb.i(str);
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            lq5.j("Given String is empty or null");
        }
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            lq5.j(str2);
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        p3d.h("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        p3d.h(str);
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        grb.i(str);
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        grb.g();
    }
}
