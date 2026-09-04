package x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class n4 implements ia.d {
    public static final n4 a = new n4();
    public static final ia.c b = new ia.c("inferenceCommonLogEvent", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("options", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("imageInfo", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("labelCount", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f = new ia.c("highestConfidence", i2.g.n(w.f.j(c0.class, new z(5))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        f8 f8Var = (f8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, f8Var.a);
        eVar.a(c, f8Var.b);
        eVar.a(d, f8Var.c);
        eVar.a(e, null);
        eVar.a(f, null);
    }
}
