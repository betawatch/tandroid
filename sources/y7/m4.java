package y7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m4 implements ka.d {
    public static final m4 a = new m4();
    public static final ka.c b = new ka.c("inferenceCommonLogEvent", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c c = new ka.c("options", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("imageInfo", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("labelCount", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f = new ka.c("highestConfidence", ic.a.m(b10.o(b0.class, new y(5))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        d8 d8Var = (d8) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, d8Var.a);
        eVar.a(c, d8Var.b);
        eVar.a(d, d8Var.c);
        eVar.a(e, null);
        eVar.a(f, null);
    }
}
