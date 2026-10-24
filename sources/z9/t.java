package z9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class t implements ja.d {
    public static final t a = new t();
    public static final ja.c b = ja.c.c("timestamp");
    public static final ja.c c = ja.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ja.c d = ja.c.c("app");
    public static final ja.c e = ja.c.c("device");
    public static final ja.c f = ja.c.c("log");
    public static final ja.c g = ja.c.c("rollouts");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        l0 l0Var = (l0) ((a2) obj);
        eVar.f(b, l0Var.a);
        eVar.d(c, l0Var.b);
        eVar.d(d, l0Var.c);
        eVar.d(e, l0Var.d);
        eVar.d(f, l0Var.e);
        eVar.d(g, l0Var.f);
    }
}
