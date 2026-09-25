package x7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s1 implements ia.d {
    public static final s1 a = new s1();
    public static final ia.c b = new ia.c("logEventKey", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c c = new ia.c("eventCount", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.c.m(v7.j.l(c0.class, new z(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, s0Var.a);
        eVar.a(c, s0Var.b);
        eVar.a(d, s0Var.c);
    }
}
