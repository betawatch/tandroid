package za;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, l0Var.a);
        eVar.a(c, l0Var.b);
        eVar.e(d, l0Var.c);
        eVar.f(e, l0Var.d);
        eVar.a(f, l0Var.e);
        eVar.a(g, l0Var.f);
    }
}
