package z9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
