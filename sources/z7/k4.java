package z7;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class k4 implements ia.d {
    public static final k4 a = new k4();
    public static final ia.c b = new ia.c("maxMs", hg.c.m(sa.e.o(w.class, new s(1))));
    public static final ia.c c = new ia.c("minMs", hg.c.m(sa.e.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.o(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.m(sa.e.o(w.class, new s(4))));
    public static final ia.c f = new ia.c("medianMs", hg.c.m(sa.e.o(w.class, new s(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.o(w.class, new s(6))));

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
