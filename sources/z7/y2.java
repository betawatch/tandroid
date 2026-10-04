package z7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class y2 implements ia.d {
    public static final y2 a = new y2();
    public static final ia.c b = new ia.c("logEventKey", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c c = new ia.c("eventCount", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("inferenceDurationStats", hg.k0.m(t8.b.o(w.class, new s(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, j1Var.a);
        eVar.a(c, j1Var.b);
        eVar.a(d, j1Var.c);
    }
}
