package w7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int b(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }
}
