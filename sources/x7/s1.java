package x7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class s1 implements ia.d {
    public static final s1 a = new s1();
    public static final ia.c b = new ia.c("logEventKey", hg.k0.o(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("eventCount", hg.k0.o(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.k0.o(w.f.j(c0.class, new z(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, s0Var.a);
        eVar.a(c, s0Var.b);
        eVar.a(d, s0Var.c);
    }
}
