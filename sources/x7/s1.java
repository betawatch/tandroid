package x7;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class s1 implements ia.d {
    public static final s1 a = new s1();
    public static final ia.c b = new ia.c("logEventKey", hg.k0.m(t8.b.n(c0.class, new z(1))));
    public static final ia.c c = new ia.c("eventCount", hg.k0.m(t8.b.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.k0.m(t8.b.n(c0.class, new z(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, s0Var.a);
        eVar.a(c, s0Var.b);
        eVar.a(d, s0Var.c);
    }
}
