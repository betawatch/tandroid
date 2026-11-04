package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class j5 {
    public static void a(int i3, int i10) {
        String a10;
        if (i3 < 0 || i3 >= i10) {
            if (i3 < 0) {
                a10 = k5.a("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(k2.p1.i(i10, "negative size: "));
                }
                a10 = k5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(a10);
        }
    }

    public static void b(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            throw new IndexOutOfBoundsException(d(i3, i10, "index"));
        }
    }

    public static void c(int i3, int i10, int i11) {
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i11) ? d(i3, i11, "start index") : (i10 < 0 || i10 > i11) ? d(i10, i11, "end index") : k5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3)));
        }
    }

    public static String d(int i3, int i10, String str) {
        if (i3 < 0) {
            return k5.a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return k5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(k2.p1.i(i10, "negative size: "));
    }
}
