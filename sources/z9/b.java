package z9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements ja.d {
    public static final b a = new b();
    public static final ja.c b = ja.c.c("pid");
    public static final ja.c c = ja.c.c("processName");
    public static final ja.c d = ja.c.c("reasonCode");
    public static final ja.c e = ja.c.c("importance");
    public static final ja.c f = ja.c.c("pss");
    public static final ja.c g = ja.c.c("rss");
    public static final ja.c h = ja.c.c("timestamp");
    public static final ja.c i = ja.c.c("traceFile");
    public static final ja.c j = ja.c.c("buildIdMappingForArch");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.g(b, b0Var.a);
        eVar.d(c, b0Var.b);
        eVar.g(d, b0Var.c);
        eVar.g(e, b0Var.d);
        eVar.f(f, b0Var.e);
        eVar.f(g, b0Var.f);
        eVar.f(h, b0Var.g);
        eVar.d(i, b0Var.h);
        eVar.d(j, b0Var.i);
    }
}
