package x7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class s1 implements ja.d {
    public static final s1 a = new s1();
    public static final ja.c b = new ja.c("logEventKey", i2.e.o(r4.c.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("eventCount", i2.e.o(r4.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("inferenceDurationStats", i2.e.o(r4.c.m(c0.class, new z(3))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, s0Var.a);
        eVar.d(c, s0Var.b);
        eVar.d(d, s0Var.c);
    }
}
