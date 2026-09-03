package x2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements u9.d {
    public static final f a = new f();
    public static final u9.c b = u9.c.c("requestTimeMs");
    public static final u9.c c = u9.c.c("requestUptimeMs");
    public static final u9.c d = u9.c.c("clientInfo");
    public static final u9.c e = u9.c.c("logSource");
    public static final u9.c f = u9.c.c("logSourceName");
    public static final u9.c g = u9.c.c("logEvent");
    public static final u9.c h = u9.c.c("qosTier");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(b, lVar.a);
        eVar.b(c, lVar.b);
        eVar.e(d, lVar.c);
        eVar.e(e, lVar.d);
        eVar.e(f, lVar.e);
        eVar.e(g, lVar.f);
        eVar.e(h, w.a);
    }
}
