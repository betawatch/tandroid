// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
