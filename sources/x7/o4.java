package x7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class o4 implements ja.d {
    public static final o4 a = new o4();
    public static final ja.c b = new ja.c("detectorOptions", i2.d.o(t8.b.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("errorCodes", i2.d.o(t8.b.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i2.d.o(t8.b.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i2.d.o(t8.b.m(c0.class, new z(4))));
    public static final ja.c f = new ja.c("otherErrors", i2.d.o(t8.b.m(c0.class, new z(5))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, g8Var.a);
        eVar.d(c, g8Var.b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f, null);
    }
}
