package v7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder m10 = i0.a.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            m10.append(i12);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a1.g.j(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
