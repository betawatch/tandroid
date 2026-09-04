package z7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d8 implements ia.d {
    public static final d8 a = new d8();
    public static final ia.c b = new ia.c("errorCode", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("durationMs", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("subjectSegmenterOptions", i2.g.n(w.f.k(w.class, new s(3))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, feVar.a);
        eVar.a(c, feVar.b);
        eVar.a(d, feVar.c);
    }
}
