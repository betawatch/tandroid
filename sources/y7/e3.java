package y7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e3 implements ka.d {
    public static final e3 a = new e3();
    public static final ka.c b = new ka.c("maxMs", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c c = new ka.c("minMs", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("avgMs", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("firstQuartileMs", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f = new ka.c("medianMs", ic.a.m(b10.o(b0.class, new y(5))));
    public static final ka.c g = new ka.c("thirdQuartileMs", ic.a.m(b10.o(b0.class, new y(6))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        y6 y6Var = (y6) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, y6Var.a);
        eVar.a(c, y6Var.b);
        eVar.a(d, y6Var.c);
        eVar.a(e, y6Var.d);
        eVar.a(f, y6Var.e);
        eVar.a(g, y6Var.f);
    }
}
