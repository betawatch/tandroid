package z7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k4 implements ja.d {
    public static final k4 a = new k4();
    public static final ja.c b = new ja.c("maxMs", i2.d.o(r4.c.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("minMs", i2.d.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f = new ja.c("medianMs", i2.d.o(r4.c.n(w.class, new s(5))));
    public static final ja.c g = new ja.c("thirdQuartileMs", i2.d.o(r4.c.n(w.class, new s(6))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, maVar.a);
        eVar.d(c, maVar.b);
        eVar.d(d, maVar.c);
        eVar.d(e, maVar.d);
        eVar.d(f, maVar.e);
        eVar.d(g, maVar.f);
    }
}
