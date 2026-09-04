package z7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z2 implements ia.d {
    public static final z2 a = new z2();
    public static final ia.c b = new ia.c("errorCode", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("isColdCall", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("imageInfo", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("subjectSegmenterOptions", i2.g.n(w.f.k(w.class, new s(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, i1Var.a);
        eVar.a(c, i1Var.b);
        eVar.a(d, null);
        eVar.a(e, i1Var.c);
    }
}
