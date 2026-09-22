package v7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class b8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder m10 = hg.c.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            m10.append(i12);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.a.m(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
