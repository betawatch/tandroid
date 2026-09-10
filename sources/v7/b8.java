package v7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class b8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder n10 = hc.b.n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            n10.append(i12);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.a.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
