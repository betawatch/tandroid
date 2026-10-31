package z7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r4 implements ja.d {
    public static final r4 a = new r4();
    public static final ja.c b = new ja.c("imageFormat", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("originalImageSize", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i0.a.o(sc.e.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i0.a.o(sc.e.n(w.class, new s(4))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, raVar.a);
        eVar.d(c, raVar.b);
        eVar.d(d, null);
        eVar.d(e, null);
    }
}
