package x7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class k3 implements ia.d {
    public static final k3 a = new k3();
    public static final ia.c b = new ia.c("imageFormat", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c c = new ia.c("originalImageSize", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", i2.g.n(w.f.j(c0.class, new z(4))));

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
