// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s70 implements zq7 {
    public static final s70 a = new s70();
    public static final sa4 b = sa4.c("performance");
    public static final sa4 c = sa4.c("crashlytics");
    public static final sa4 d = sa4.c("sessionSamplingRate");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        t63 t63Var = (t63) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, t63Var.a);
        ar7Var.a(c, t63Var.b);
        ar7Var.f(d, t63Var.c);
    }
}
