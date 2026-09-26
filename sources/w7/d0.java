package w7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int b(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }
}
