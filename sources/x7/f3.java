package x7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class f3 implements ia.d {
    public static final f3 a = new f3();
    public static final ia.c b = new ia.c("maxMs", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c c = new ia.c("minMs", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(v7.j.l(c0.class, new z(4))));
    public static final ia.c f = new ia.c("medianMs", hg.c.m(v7.j.l(c0.class, new z(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hg.c.m(v7.j.l(c0.class, new z(6))));

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
