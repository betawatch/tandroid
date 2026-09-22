package x7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class k3 implements ia.d {
    public static final k3 a = new k3();
    public static final ia.c b = new ia.c("imageFormat", hg.c.o(w.c.k(c0.class, new z(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.c.o(w.c.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.o(w.c.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.c.o(w.c.k(c0.class, new z(4))));

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
