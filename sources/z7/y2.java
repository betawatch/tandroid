package z7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class y2 implements ja.d {
    public static final y2 a = new y2();
    public static final ja.c b = new ja.c("logEventKey", i2.d.o(r4.c.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("eventCount", i2.d.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("inferenceDurationStats", i2.d.o(r4.c.n(w.class, new s(3))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, j1Var.a);
        eVar.d(c, j1Var.b);
        eVar.d(d, j1Var.c);
    }
}
