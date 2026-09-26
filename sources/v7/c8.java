package v7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class c8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder k10 = hg.c.k("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            k10.append(i12);
            throw new IndexOutOfBoundsException(k10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.a.m(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
