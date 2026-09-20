package x7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class k3 implements ia.d {
    public static final k3 a = new k3();
    public static final ia.c b = new ia.c("imageFormat", hg.k0.n(v7.j0.k(c0.class, new z(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.k0.n(v7.j0.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.k0.n(v7.j0.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.k0.n(v7.j0.k(c0.class, new z(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, f7Var.a);
        eVar.a(c, f7Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
