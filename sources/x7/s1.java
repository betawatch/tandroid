package x7;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
