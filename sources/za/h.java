package za;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, j0Var.a);
        eVar.a(c, j0Var.b);
        eVar.e(d, j0Var.c);
        eVar.f(e, j0Var.d);
        eVar.a(f, j0Var.e);
        eVar.a(g, j0Var.f);
    }
}
