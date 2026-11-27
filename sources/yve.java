// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class yve {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return fze.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return fze.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        lq5.j(uh9.k(i2, "negative size: "));
        return null;
    }

    public static void b(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, Integer.valueOf(i)));
    }

    public static void d(long j, String str, boolean z) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, Long.valueOf(j)));
    }

    public static void e(String str, boolean z) {
        if (z) {
            return;
        }
        lq5.j(str);
    }

    public static void f(boolean z) {
        if (z) {
            return;
        }
        iy8.d();
    }

    public static void g(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void h(boolean z, String str, Comparable comparable) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, comparable));
    }

    public static void i(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        lq5.j(fze.a(str, obj, comparable));
    }

    public static void j(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = fze.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    lq5.j(uh9.k(i2, "negative size: "));
                    return;
                }
                a = fze.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void k(Object obj) {
        obj.getClass();
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        p3d.h(str);
    }

    public static void m(int i, int i2) {
        if (i < 0 || i > i2) {
            su3.g(a(i, i2, "index"));
        }
    }

    public static void n(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? a(i, i3, "start index") : (i2 < 0 || i2 > i3) ? a(i2, i3, "end index") : fze.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        grb.i(str);
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        grb.g();
    }
}
