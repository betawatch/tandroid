package z7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
