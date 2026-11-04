package qe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public final d a;
    public final k b = new k(0.0f);
    public final k c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k e = new k(0.0f);
    public final k f = new k(0.0f);
    public final k g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.a = dVar;
    }

    public static void a(g gVar, int i3, boolean z10) {
        k kVar = gVar.c;
        k kVar2 = gVar.b;
        if (z10) {
            kVar2.c = i3;
            kVar.c = i3 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i3);
            kVar.d(i3 > 0 ? 1.0f : 0.0f);
        }
    }
}
