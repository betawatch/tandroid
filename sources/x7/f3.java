package x7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class f3 implements ia.d {
    public static final f3 a = new f3();
    public static final ia.c b = new ia.c("maxMs", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c c = new ia.c("minMs", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.n(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(sa.e.n(c0.class, new z(4))));
    public static final ia.c f = new ia.c("medianMs", hg.c.m(sa.e.n(c0.class, new z(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.n(c0.class, new z(6))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, a7Var.a);
        eVar.a(c, a7Var.b);
        eVar.a(d, a7Var.c);
        eVar.a(e, a7Var.d);
        eVar.a(f, a7Var.e);
        eVar.a(g, a7Var.f);
    }
}
