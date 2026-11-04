package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(int i3, int i10) {
        return (i3 & i10) != 0;
    }

    public static int b(int i3, int i10, boolean z10) {
        return z10 ? i3 | i10 : i3 & (~i10);
    }
}
