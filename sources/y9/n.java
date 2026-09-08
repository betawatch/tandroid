package y9;

import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
