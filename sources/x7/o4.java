package x7;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class o4 implements ia.d {
    public static final o4 a = new o4();
    public static final ia.c b = new ia.c("detectorOptions", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("errorCodes", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("otherErrors", i2.g.n(w.f.j(c0.class, new z(5))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, g8Var.a);
        eVar.a(c, g8Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f, null);
    }
}
