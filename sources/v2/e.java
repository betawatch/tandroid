package v2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements q9.d {
    public static final e a = new e();
    public static final q9.c b = q9.c.c("eventTimeMs");
    public static final q9.c c = q9.c.c("eventCode");
    public static final q9.c d = q9.c.c("eventUptimeMs");
    public static final q9.c e = q9.c.c("sourceExtension");
    public static final q9.c f = q9.c.c("sourceExtensionJsonProto3");
    public static final q9.c g = q9.c.c("timezoneOffsetSeconds");
    public static final q9.c h = q9.c.c("networkConnectionInfo");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.d(b, kVar.a);
        eVar.g(c, kVar.b);
        eVar.d(d, kVar.c);
        eVar.g(e, kVar.d);
        eVar.g(f, kVar.e);
        eVar.d(g, kVar.f);
        eVar.g(h, kVar.g);
    }
}
