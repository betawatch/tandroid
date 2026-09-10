package za;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements ia.d {
    public static final h a = new h();
    public static final ia.c b = ia.c.c("sessionId");
    public static final ia.c c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f = ia.c.c("dataCollectionStatus");
    public static final ia.c g = ia.c.c("firebaseInstallationId");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, k0Var.a);
        eVar.a(c, k0Var.b);
        eVar.e(d, k0Var.c);
        eVar.f(e, k0Var.d);
        eVar.a(f, k0Var.e);
        eVar.a(g, k0Var.f);
    }
}
