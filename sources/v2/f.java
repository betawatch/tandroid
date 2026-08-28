package v2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements q9.d {
    public static final f a = new f();
    public static final q9.c b = q9.c.c("requestTimeMs");
    public static final q9.c c = q9.c.c("requestUptimeMs");
    public static final q9.c d = q9.c.c("clientInfo");
    public static final q9.c e = q9.c.c("logSource");
    public static final q9.c f = q9.c.c("logSourceName");
    public static final q9.c g = q9.c.c("logEvent");
    public static final q9.c h = q9.c.c("qosTier");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.d(b, lVar.a);
        eVar.d(c, lVar.b);
        eVar.g(d, lVar.c);
        eVar.g(e, lVar.d);
        eVar.g(f, lVar.e);
        eVar.g(g, lVar.f);
        eVar.g(h, w.a);
    }
}
