package z9;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class s implements ja.d {
    public static final s a = new s();
    public static final ja.c b = ja.c.c("batteryLevel");
    public static final ja.c c = ja.c.c("batteryVelocity");
    public static final ja.c d = ja.c.c("proximityOn");
    public static final ja.c e = ja.c.c("orientation");
    public static final ja.c f = ja.c.c("ramUsed");
    public static final ja.c g = ja.c.c("diskUsed");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.d(b, u0Var.a);
        eVar.g(c, u0Var.b);
        eVar.a(d, u0Var.c);
        eVar.g(e, u0Var.d);
        eVar.f(f, u0Var.e);
        eVar.f(g, u0Var.f);
    }
}
