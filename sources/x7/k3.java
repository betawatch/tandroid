package x7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class k3 implements ia.d {
    public static final k3 a = new k3();
    public static final ia.c b = new ia.c("imageFormat", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.c.m(v7.j.l(c0.class, new z(4))));

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
