package z7;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class r4 implements ia.d {
    public static final r4 a = new r4();
    public static final ia.c b = new ia.c("imageFormat", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.k0.m(t8.b.o(w.class, new s(4))));

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
