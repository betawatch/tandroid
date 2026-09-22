package x7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class s1 implements ia.d {
    public static final s1 a = new s1();
    public static final ia.c b = new ia.c("logEventKey", hg.k0.n(v7.j0.k(c0.class, new z(1))));
    public static final ia.c c = new ia.c("eventCount", hg.k0.n(v7.j0.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.k0.n(v7.j0.k(c0.class, new z(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, s0Var.a);
        eVar.a(c, s0Var.b);
        eVar.a(d, s0Var.c);
    }
}
