package z7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k4 implements ia.d {
    public static final k4 a = new k4();
    public static final ia.c b = new ia.c("maxMs", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("minMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f = new ia.c("medianMs", i2.g.n(w.f.k(w.class, new s(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", i2.g.n(w.f.k(w.class, new s(6))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, maVar.a);
        eVar.a(c, maVar.b);
        eVar.a(d, maVar.c);
        eVar.a(e, maVar.d);
        eVar.a(f, maVar.e);
        eVar.a(g, maVar.f);
    }
}
