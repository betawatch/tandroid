package x7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class k3 implements ja.d {
    public static final k3 a = new k3();
    public static final ja.c b = new ja.c("imageFormat", i2.d.n(t8.b.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("originalImageSize", i2.d.n(t8.b.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i2.d.n(t8.b.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i2.d.n(t8.b.m(c0.class, new z(4))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, e7Var.a);
        eVar.d(c, e7Var.b);
        eVar.d(d, null);
        eVar.d(e, null);
    }
}
