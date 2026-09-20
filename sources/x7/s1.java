package x7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
