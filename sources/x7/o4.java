package x7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o4 implements ia.d {
    public static final o4 a = new o4();
    public static final ia.c b = new ia.c("detectorOptions", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("errorCodes", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hc.b.p(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hc.b.p(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("otherErrors", hc.b.p(w.f.j(c0.class, new z(5))));

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
