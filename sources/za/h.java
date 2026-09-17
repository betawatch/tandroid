package za;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
