package v7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class t6 {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return u6.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return u6.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(hg.c.i(i11, "negative size: "));
    }

    public static void b(long j3, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(u6.a(str, Long.valueOf(j3)));
        }
    }

    public static void c(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = u6.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(hg.c.i(i11, "negative size: "));
                }
                a2 = u6.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void e(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, "index"));
        }
    }

    public static void f(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? a(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? a(i11, i12, "end index") : u6.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }
}
