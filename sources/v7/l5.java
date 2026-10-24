package v7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class l5 {
    public static void a(int i10, int i11) {
        String a2;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                a2 = m5.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(i2.o1.k(i11, "negative size: "));
                }
                a2 = m5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(d(i10, i11, "index"));
        }
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : m5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return m5.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i2.o1.k(i11, "negative size: "));
    }
}
