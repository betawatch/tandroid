package z7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class r4 implements ia.d {
    public static final r4 a = new r4();
    public static final ia.c b = new ia.c("imageFormat", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("originalImageSize", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", i2.g.n(w.f.k(w.class, new s(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, raVar.a);
        eVar.a(c, raVar.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
