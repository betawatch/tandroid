package x7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f3 implements ia.d {
    public static final f3 a = new f3();
    public static final ia.c b = new ia.c("maxMs", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("minMs", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hc.b.p(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hc.b.p(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("medianMs", hc.b.p(w.f.j(c0.class, new z(5))));
    public static final ia.c g = new ia.c("thirdQuartileMs", hc.b.p(w.f.j(c0.class, new z(6))));

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
