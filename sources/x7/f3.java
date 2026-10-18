package x7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class f3 implements ja.d {
    public static final f3 a = new f3();
    public static final ja.c b = new ja.c("maxMs", i2.d.o(r4.c.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("minMs", i2.d.o(r4.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(r4.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(r4.c.m(c0.class, new z(4))));
    public static final ja.c f = new ja.c("medianMs", i2.d.o(r4.c.m(c0.class, new z(5))));
    public static final ja.c g = new ja.c("thirdQuartileMs", i2.d.o(r4.c.m(c0.class, new z(6))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, a7Var.a);
        eVar.d(c, a7Var.b);
        eVar.d(d, a7Var.c);
        eVar.d(e, a7Var.d);
        eVar.d(f, a7Var.e);
        eVar.d(g, a7Var.f);
    }
}
