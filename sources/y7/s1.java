package y7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s1 implements ka.d {
    public static final s1 a = new s1();
    public static final ka.c b = new ka.c("errorCode", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c c = new ka.c("isColdCall", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("imageInfo", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("detectorOptions", ic.a.m(b10.o(b0.class, new y(4))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, q0Var.a);
        eVar.a(c, q0Var.b);
        eVar.a(d, null);
        eVar.a(e, q0Var.c);
    }
}
