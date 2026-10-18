package z9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class j implements ja.d {
    public static final j a = new j();
    public static final ja.c b = ja.c.c("generator");
    public static final ja.c c = ja.c.c("identifier");
    public static final ja.c d = ja.c.c("appQualitySessionId");
    public static final ja.c e = ja.c.c("startedAt");
    public static final ja.c f = ja.c.c("endedAt");
    public static final ja.c g = ja.c.c("crashed");
    public static final ja.c h = ja.c.c("app");
    public static final ja.c i = ja.c.c("user");
    public static final ja.c j = ja.c.c("os");
    public static final ja.c k = ja.c.c("device");
    public static final ja.c l = ja.c.c("events");
    public static final ja.c m = ja.c.c("generatorType");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.d(b, h0Var.a);
        eVar.d(c, h0Var.b.getBytes(e2.a));
        eVar.d(d, h0Var.c);
        eVar.f(e, h0Var.d);
        eVar.d(f, h0Var.e);
        eVar.a(g, h0Var.f);
        eVar.d(h, h0Var.g);
        eVar.d(i, h0Var.h);
        eVar.d(j, h0Var.i);
        eVar.d(k, h0Var.j);
        eVar.d(l, h0Var.k);
        eVar.g(m, h0Var.l);
    }
}
