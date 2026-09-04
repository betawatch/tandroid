package y9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g implements ia.d {
    public static final g a = new g();
    public static final ia.c b = ia.c.c("identifier");
    public static final ia.c c = ia.c.c("version");
    public static final ia.c d = ia.c.c("displayVersion");
    public static final ia.c e = ia.c.c("organization");
    public static final ia.c f = ia.c.c("installationUuid");
    public static final ia.c g = ia.c.c("developmentPlatform");
    public static final ia.c h = ia.c.c("developmentPlatformVersion");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        i0 i0Var = (i0) ((l1) obj);
        eVar.a(b, i0Var.a);
        eVar.a(c, i0Var.b);
        eVar.a(d, i0Var.c);
        eVar.a(e, null);
        eVar.a(f, i0Var.d);
        eVar.a(g, i0Var.e);
        eVar.a(h, i0Var.f);
    }
}
