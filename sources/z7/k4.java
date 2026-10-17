package z7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class k4 implements ja.d {
    public static final k4 a = new k4();
    public static final ja.c b = new ja.c("maxMs", i0.a.o(r.c.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("minMs", i0.a.o(r.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(r.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(r.c.n(w.class, new s(4))));
    public static final ja.c f = new ja.c("medianMs", i0.a.o(r.c.n(w.class, new s(5))));
    public static final ja.c g = new ja.c("thirdQuartileMs", i0.a.o(r.c.n(w.class, new s(6))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        na naVar = (na) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, naVar.a);
        eVar.d(c, naVar.b);
        eVar.d(d, naVar.c);
        eVar.d(e, naVar.d);
        eVar.d(f, naVar.e);
        eVar.d(g, naVar.f);
    }
}
