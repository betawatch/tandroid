package w7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int b(int i10, int i11, boolean z10) {
        return z10 ? i10 | i11 : i10 & (~i11);
    }
}
