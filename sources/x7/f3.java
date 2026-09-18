package x7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class f3 implements ia.d {
    public static final f3 a = new f3();
    public static final ia.c b = new ia.c("maxMs", hg.k0.o(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("minMs", hg.k0.o(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.o(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.o(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("medianMs", hg.k0.o(w.f.j(c0.class, new z(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hg.k0.o(w.f.j(c0.class, new z(6))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, a7Var.a);
        eVar.a(c, a7Var.b);
        eVar.a(d, a7Var.c);
        eVar.a(e, a7Var.d);
        eVar.a(f, a7Var.e);
        eVar.a(g, a7Var.f);
    }
}
