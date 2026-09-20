package z7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
