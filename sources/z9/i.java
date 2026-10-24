package z9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class i implements ja.d {
    public static final i a = new i();
    public static final ja.c b = ja.c.c("arch");
    public static final ja.c c = ja.c.c("model");
    public static final ja.c d = ja.c.c("cores");
    public static final ja.c e = ja.c.c("ram");
    public static final ja.c f = ja.c.c("diskSpace");
    public static final ja.c g = ja.c.c("simulator");
    public static final ja.c h = ja.c.c("state");
    public static final ja.c i = ja.c.c("manufacturer");
    public static final ja.c j = ja.c.c("modelClass");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        k0 k0Var = (k0) ((m1) obj);
        eVar.g(b, k0Var.a);
        eVar.d(c, k0Var.b);
        eVar.g(d, k0Var.c);
        eVar.f(e, k0Var.d);
        eVar.f(f, k0Var.e);
        eVar.a(g, k0Var.f);
        eVar.g(h, k0Var.g);
        eVar.d(i, k0Var.h);
        eVar.d(j, k0Var.i);
    }
}
