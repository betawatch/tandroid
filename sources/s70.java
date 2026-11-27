// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
