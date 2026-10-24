package z9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
