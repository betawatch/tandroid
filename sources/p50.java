// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class p50 implements zq7 {
    public static final p50 a = new p50();
    public static final sa4 b = sa4.c("requestTimeMs");
    public static final sa4 c = sa4.c("requestUptimeMs");
    public static final sa4 d = sa4.c("clientInfo");
    public static final sa4 e = sa4.c("logSource");
    public static final sa4 f = sa4.c("logSourceName");
    public static final sa4 g = sa4.c("logEvent");
    public static final sa4 h = sa4.c("qosTier");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        de6 de6Var = (de6) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((da0) de6Var).a);
        da0 da0Var = (da0) de6Var;
        ar7Var.g(c, da0Var.b);
        ar7Var.a(d, da0Var.c);
        ar7Var.a(e, da0Var.d);
        ar7Var.a(f, da0Var.e);
        ar7Var.a(g, da0Var.f);
        ar7Var.a(h, py8.a);
    }
}
