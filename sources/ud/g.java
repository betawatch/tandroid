package ud;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public static void a(g gVar, int i10, boolean z10) {
        k kVar = gVar.c;
        k kVar2 = gVar.b;
        if (z10) {
            kVar2.c = i10;
            kVar.c = i10 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i10);
            kVar.d(i10 > 0 ? 1.0f : 0.0f);
        }
    }
}
