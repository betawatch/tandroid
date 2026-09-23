package z7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class r4 implements ia.d {
    public static final r4 a = new r4();
    public static final ia.c b = new ia.c("imageFormat", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c c = new ia.c("originalImageSize", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hg.c.o(w.c.l(w.class, new s(4))));

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
