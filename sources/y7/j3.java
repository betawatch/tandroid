package y7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j3 implements ka.d {
    public static final j3 a = new j3();
    public static final ka.c b = new ka.c("imageFormat", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c c = new ka.c("originalImageSize", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("compressedImageSize", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("isOdmlImage", ic.a.m(b10.o(b0.class, new y(4))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        c7 c7Var = (c7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, c7Var.a);
        eVar.a(c, c7Var.b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
