package y9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class t implements ia.d {
    public static final t a = new t();
    public static final ia.c b = ia.c.c("timestamp");
    public static final ia.c c = ia.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ia.c d = ia.c.c("app");
    public static final ia.c e = ia.c.c("device");
    public static final ia.c f = ia.c.c("log");
    public static final ia.c g = ia.c.c("rollouts");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.f(b, l0Var.a);
        eVar.a(c, l0Var.b);
        eVar.a(d, l0Var.c);
        eVar.a(e, l0Var.d);
        eVar.a(f, l0Var.e);
        eVar.a(g, l0Var.f);
    }
}
