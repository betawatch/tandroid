package y9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b implements ia.d {
    public static final b a = new b();
    public static final ia.c b = ia.c.c("pid");
    public static final ia.c c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f = ia.c.c("pss");
    public static final ia.c g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c i = ia.c.c("traceFile");
    public static final ia.c j = ia.c.c("buildIdMappingForArch");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(b, b0Var.a);
        eVar.a(c, b0Var.b);
        eVar.e(d, b0Var.c);
        eVar.e(e, b0Var.d);
        eVar.f(f, b0Var.e);
        eVar.f(g, b0Var.f);
        eVar.f(h, b0Var.g);
        eVar.a(i, b0Var.h);
        eVar.a(j, b0Var.i);
    }
}
