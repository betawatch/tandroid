package x7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f3 implements ia.d {
    public static final f3 a = new f3();
    public static final ia.c b = new ia.c("maxMs", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("minMs", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("medianMs", i2.g.n(w.f.j(c0.class, new z(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", i2.g.n(w.f.j(c0.class, new z(6))));

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
