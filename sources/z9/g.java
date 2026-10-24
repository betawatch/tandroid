package z9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g implements ja.d {
    public static final g a = new g();
    public static final ja.c b = ja.c.c("identifier");
    public static final ja.c c = ja.c.c("version");
    public static final ja.c d = ja.c.c("displayVersion");
    public static final ja.c e = ja.c.c("organization");
    public static final ja.c f = ja.c.c("installationUuid");
    public static final ja.c g = ja.c.c("developmentPlatform");
    public static final ja.c h = ja.c.c("developmentPlatformVersion");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        i0 i0Var = (i0) ((l1) obj);
        eVar.d(b, i0Var.a);
        eVar.d(c, i0Var.b);
        eVar.d(d, i0Var.c);
        eVar.d(e, null);
        eVar.d(f, i0Var.d);
        eVar.d(g, i0Var.e);
        eVar.d(h, i0Var.f);
    }
}
