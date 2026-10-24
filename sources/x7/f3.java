package x7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f3 implements ja.d {
    public static final f3 a = new f3();
    public static final ja.c b = new ja.c("maxMs", i2.o1.p(si.o0.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("minMs", i2.o1.p(si.o0.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.o1.p(si.o0.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.o1.p(si.o0.m(c0.class, new z(4))));
    public static final ja.c f = new ja.c("medianMs", i2.o1.p(si.o0.m(c0.class, new z(5))));
    public static final ja.c g = new ja.c("thirdQuartileMs", i2.o1.p(si.o0.m(c0.class, new z(6))));

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
