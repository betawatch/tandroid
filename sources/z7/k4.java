package z7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class k4 implements ia.d {
    public static final k4 a = new k4();
    public static final ia.c b = new ia.c("maxMs", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c c = new ia.c("minMs", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f = new ia.c("medianMs", hg.c.o(w.c.l(w.class, new s(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hg.c.o(w.c.l(w.class, new s(6))));

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
