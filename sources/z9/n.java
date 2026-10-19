package z9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class n implements ja.d {
    public static final n a = new n();
    public static final ja.c b = ja.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ja.c c = ja.c.c("reason");
    public static final ja.c d = ja.c.c("frames");
    public static final ja.c e = ja.c.c("causedBy");
    public static final ja.c f = ja.c.c("overflowCount");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.d(b, p0Var.a);
        eVar.d(c, p0Var.b);
        eVar.d(d, p0Var.c);
        eVar.d(e, p0Var.d);
        eVar.g(f, p0Var.e);
    }
}
