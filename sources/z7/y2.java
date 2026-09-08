package z7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y2 implements ia.d {
    public static final y2 a = new y2();
    public static final ia.c b = new ia.c("logEventKey", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("eventCount", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", i2.g.n(w.f.k(w.class, new s(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, j1Var.a);
        eVar.a(c, j1Var.b);
        eVar.a(d, j1Var.c);
    }
}
