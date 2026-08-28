package td;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static void a(g gVar, int i9, boolean z10) {
        k kVar = gVar.c;
        k kVar2 = gVar.b;
        if (z10) {
            kVar2.c = i9;
            kVar.c = i9 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i9);
            kVar.d(i9 > 0 ? 1.0f : 0.0f);
        }
    }
}
