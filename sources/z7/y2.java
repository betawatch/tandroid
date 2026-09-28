package z7;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class y2 implements ia.d {
    public static final y2 a = new y2();
    public static final ia.c b = new ia.c("logEventKey", hg.c.m(v7.j.m(w.class, new s(1))));
    public static final ia.c c = new ia.c("eventCount", hg.c.m(v7.j.m(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.c.m(v7.j.m(w.class, new s(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, j1Var.a);
        eVar.a(c, j1Var.b);
        eVar.a(d, j1Var.c);
    }
}
