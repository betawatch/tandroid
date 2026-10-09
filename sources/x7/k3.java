package x7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k3 implements ia.d {
    public static final k3 a = new k3();
    public static final ia.c b = new ia.c("imageFormat", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.c.m(sc.v.n(c0.class, new z(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, e7Var.a);
        eVar.a(c, e7Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
