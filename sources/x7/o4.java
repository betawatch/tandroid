package x7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o4 implements ja.d {
    public static final o4 a = new o4();
    public static final ja.c b = new ja.c("detectorOptions", i0.a.o(sc.e.m(c0.class, new z(1))));
    public static final ja.c c = new ja.c("errorCodes", i0.a.o(sc.e.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i0.a.o(sc.e.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i0.a.o(sc.e.m(c0.class, new z(4))));
    public static final ja.c f = new ja.c("otherErrors", i0.a.o(sc.e.m(c0.class, new z(5))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        h8 h8Var = (h8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, h8Var.a);
        eVar.d(c, h8Var.b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f, null);
    }
}
