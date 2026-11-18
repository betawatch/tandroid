package te;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.c;
        k kVar2 = gVar.b;
        if (z10) {
            kVar2.c = i7;
            kVar.c = i7 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i7);
            kVar.d(i7 > 0 ? 1.0f : 0.0f);
        }
    }
}
