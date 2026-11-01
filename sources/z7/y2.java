package z7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class y2 implements ja.d {
    public static final y2 a = new y2();
    public static final ja.c b = new ja.c("logEventKey", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("eventCount", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("inferenceDurationStats", i0.a.o(sc.e.n(w.class, new s(3))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, j1Var.a);
        eVar.d(c, j1Var.b);
        eVar.d(d, j1Var.c);
    }
}
