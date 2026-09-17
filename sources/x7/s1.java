package x7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class s1 implements ia.d {
    public static final s1 a = new s1();
    public static final ia.c b = new ia.c("logEventKey", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("eventCount", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", i2.g.n(w.f.j(c0.class, new z(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, s0Var.a);
        eVar.a(c, s0Var.b);
        eVar.a(d, s0Var.c);
    }
}
