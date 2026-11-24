// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class p1f {
    public static void a(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = s1f.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    w26.j(de9.k(i2, "negative size: "));
                    return;
                }
                a = s1f.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            k93.i(d(i, i2, "index"));
        }
    }

    public static void c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : s1f.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return s1f.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return s1f.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        w26.j(de9.k(i2, "negative size: "));
        return null;
    }
}
