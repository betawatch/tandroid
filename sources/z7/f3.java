package z7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f3 implements ma.d {
    public static final f3 a = new f3();
    public static final ma.c b = new ma.c("maxMs", k2.p1.o(t4.c.k(b0.class, new y(1))));
    public static final ma.c c = new ma.c("minMs", k2.p1.o(t4.c.k(b0.class, new y(2))));
    public static final ma.c d = new ma.c("avgMs", k2.p1.o(t4.c.k(b0.class, new y(3))));
    public static final ma.c e = new ma.c("firstQuartileMs", k2.p1.o(t4.c.k(b0.class, new y(4))));
    public static final ma.c f = new ma.c("medianMs", k2.p1.o(t4.c.k(b0.class, new y(5))));
    public static final ma.c g = new ma.c("thirdQuartileMs", k2.p1.o(t4.c.k(b0.class, new y(6))));

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        z6 z6Var = (z6) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, z6Var.a);
        eVar.a(c, z6Var.b);
        eVar.a(d, z6Var.c);
        eVar.a(e, z6Var.d);
        eVar.a(f, z6Var.e);
        eVar.a(g, z6Var.f);
    }
}
