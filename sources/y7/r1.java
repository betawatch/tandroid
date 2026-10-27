package y7;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r1 implements ka.d {
    public static final r1 a = new r1();
    public static final ka.c b = new ka.c("logEventKey", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c c = new ka.c("eventCount", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("inferenceDurationStats", ic.a.m(b10.o(b0.class, new y(3))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, r0Var.a);
        eVar.a(c, r0Var.b);
        eVar.a(d, r0Var.c);
    }
}
