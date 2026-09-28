package v7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
