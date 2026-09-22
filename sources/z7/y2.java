package z7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class y2 implements ia.d {
    public static final y2 a = new y2();
    public static final ia.c b = new ia.c("logEventKey", hg.k0.n(v7.j0.l(w.class, new s(1))));
    public static final ia.c c = new ia.c("eventCount", hg.k0.n(v7.j0.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.k0.n(v7.j0.l(w.class, new s(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, j1Var.a);
        eVar.a(c, j1Var.b);
        eVar.a(d, j1Var.c);
    }
}
