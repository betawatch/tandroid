package v7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class c8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder l4 = hg.k0.l("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            l4.append(i12);
            throw new IndexOutOfBoundsException(l4.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a4.a.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
