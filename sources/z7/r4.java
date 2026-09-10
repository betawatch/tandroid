package z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r4 implements ia.d {
    public static final r4 a = new r4();
    public static final ia.c b = new ia.c("imageFormat", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("originalImageSize", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hc.b.p(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hc.b.p(w.f.k(w.class, new s(4))));

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
