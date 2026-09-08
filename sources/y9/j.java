package y9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements ia.d {
    public static final j a = new j();
    public static final ia.c b = ia.c.c("generator");
    public static final ia.c c = ia.c.c("identifier");
    public static final ia.c d = ia.c.c("appQualitySessionId");
    public static final ia.c e = ia.c.c("startedAt");
    public static final ia.c f = ia.c.c("endedAt");
    public static final ia.c g = ia.c.c("crashed");
    public static final ia.c h = ia.c.c("app");
    public static final ia.c i = ia.c.c("user");
    public static final ia.c j = ia.c.c("os");
    public static final ia.c k = ia.c.c("device");
    public static final ia.c l = ia.c.c("events");
    public static final ia.c m = ia.c.c("generatorType");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.a(b, h0Var.a);
        eVar.a(c, h0Var.b.getBytes(e2.a));
        eVar.a(d, h0Var.c);
        eVar.f(e, h0Var.d);
        eVar.a(f, h0Var.e);
        eVar.c(g, h0Var.f);
        eVar.a(h, h0Var.g);
        eVar.a(i, h0Var.h);
        eVar.a(j, h0Var.i);
        eVar.a(k, h0Var.j);
        eVar.a(l, h0Var.k);
        eVar.e(m, h0Var.l);
    }
}
