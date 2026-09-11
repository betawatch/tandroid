package y9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n implements ia.d {
    public static final n a = new n();
    public static final ia.c b = ia.c.c(TeXSymbolParser.TYPE_ATTR);
    public static final ia.c c = ia.c.c("reason");
    public static final ia.c d = ia.c.c("frames");
    public static final ia.c e = ia.c.c("causedBy");
    public static final ia.c f = ia.c.c("overflowCount");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        p0 p0Var = (p0) ((o1) obj);
        eVar.a(b, p0Var.a);
        eVar.a(c, p0Var.b);
        eVar.a(d, p0Var.c);
        eVar.a(e, p0Var.d);
        eVar.e(f, p0Var.e);
    }
}
