package x7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class k3 implements ja.d {
    public static final k3 a = new k3();
    public static final ja.c b = new ja.c("imageFormat", i2.e.o(r4.c.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("originalImageSize", i2.e.o(r4.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i2.e.o(r4.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i2.e.o(r4.c.m(c0.class, new z(4))));

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
