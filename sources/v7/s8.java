package v7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class s8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder k10 = com.google.android.gms.internal.play_billing.k3.k("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            k10.append(i12);
            throw new IndexOutOfBoundsException(k10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
