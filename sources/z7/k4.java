package z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k4 implements ia.d {
    public static final k4 a = new k4();
    public static final ia.c b = new ia.c("maxMs", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("minMs", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("avgMs", hc.b.p(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hc.b.p(w.f.k(w.class, new s(4))));
    public static final ia.c f = new ia.c("medianMs", hc.b.p(w.f.k(w.class, new s(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hc.b.p(w.f.k(w.class, new s(6))));

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
