package z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
