package x2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements s9.d {
    public static final f a = new f();
    public static final s9.c b = s9.c.c("requestTimeMs");
    public static final s9.c c = s9.c.c("requestUptimeMs");
    public static final s9.c d = s9.c.c("clientInfo");
    public static final s9.c e = s9.c.c("logSource");
    public static final s9.c f = s9.c.c("logSourceName");
    public static final s9.c g = s9.c.c("logEvent");
    public static final s9.c h = s9.c.c("qosTier");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.c(b, lVar.a);
        eVar.c(c, lVar.b);
        eVar.e(d, lVar.c);
        eVar.e(e, lVar.d);
        eVar.e(f, lVar.e);
        eVar.e(g, lVar.f);
        eVar.e(h, w.a);
    }
}
