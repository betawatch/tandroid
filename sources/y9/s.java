package y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s implements ia.d {
    public static final s a = new s();
    public static final ia.c b = ia.c.c("batteryLevel");
    public static final ia.c c = ia.c.c("batteryVelocity");
    public static final ia.c d = ia.c.c("proximityOn");
    public static final ia.c e = ia.c.c("orientation");
    public static final ia.c f = ia.c.c("ramUsed");
    public static final ia.c g = ia.c.c("diskUsed");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(b, u0Var.a);
        eVar.e(c, u0Var.b);
        eVar.c(d, u0Var.c);
        eVar.e(e, u0Var.d);
        eVar.f(f, u0Var.e);
        eVar.f(g, u0Var.f);
    }
}
