package x7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class s1 implements ja.d {
    public static final s1 a = new s1();
    public static final ja.c b = new ja.c("logEventKey", i2.o1.p(si.o0.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("eventCount", i2.o1.p(si.o0.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("inferenceDurationStats", i2.o1.p(si.o0.m(c0.class, new z(3))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, s0Var.a);
        eVar.d(c, s0Var.b);
        eVar.d(d, s0Var.c);
    }
}
