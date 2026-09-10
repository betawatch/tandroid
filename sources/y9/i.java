package y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i implements ia.d {
    public static final i a = new i();
    public static final ia.c b = ia.c.c("arch");
    public static final ia.c c = ia.c.c("model");
    public static final ia.c d = ia.c.c("cores");
    public static final ia.c e = ia.c.c("ram");
    public static final ia.c f = ia.c.c("diskSpace");
    public static final ia.c g = ia.c.c("simulator");
    public static final ia.c h = ia.c.c("state");
    public static final ia.c i = ia.c.c("manufacturer");
    public static final ia.c j = ia.c.c("modelClass");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        k0 k0Var = (k0) ((m1) obj);
        eVar.e(b, k0Var.a);
        eVar.a(c, k0Var.b);
        eVar.e(d, k0Var.c);
        eVar.f(e, k0Var.d);
        eVar.f(f, k0Var.e);
        eVar.c(g, k0Var.f);
        eVar.e(h, k0Var.g);
        eVar.a(i, k0Var.h);
        eVar.a(j, k0Var.i);
    }
}
