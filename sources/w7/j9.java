package w7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class j9 {
    public static void a(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = m9.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(hg.k0.i(i11, "negative size: "));
                }
                a2 = m9.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void b(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? c(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? c(i11, i12, "end index") : m9.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String c(int i10, int i11, String str) {
        if (i10 < 0) {
            return m9.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m9.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(hg.k0.i(i11, "negative size: "));
    }
}
