package v2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements r9.d {
    public static final f a = new f();
    public static final r9.c b = r9.c.c("requestTimeMs");
    public static final r9.c c = r9.c.c("requestUptimeMs");
    public static final r9.c d = r9.c.c("clientInfo");
    public static final r9.c e = r9.c.c("logSource");
    public static final r9.c f = r9.c.c("logSourceName");
    public static final r9.c g = r9.c.c("logEvent");
    public static final r9.c h = r9.c.c("qosTier");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.c(b, lVar.a);
        eVar.c(c, lVar.b);
        eVar.a(d, lVar.c);
        eVar.a(e, lVar.d);
        eVar.a(f, lVar.e);
        eVar.a(g, lVar.f);
        eVar.a(h, w.a);
    }
}
