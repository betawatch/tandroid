package v2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements r9.d {
    public static final e a = new e();
    public static final r9.c b = r9.c.c("eventTimeMs");
    public static final r9.c c = r9.c.c("eventCode");
    public static final r9.c d = r9.c.c("eventUptimeMs");
    public static final r9.c e = r9.c.c("sourceExtension");
    public static final r9.c f = r9.c.c("sourceExtensionJsonProto3");
    public static final r9.c g = r9.c.c("timezoneOffsetSeconds");
    public static final r9.c h = r9.c.c("networkConnectionInfo");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.c(b, kVar.a);
        eVar.a(c, kVar.b);
        eVar.c(d, kVar.c);
        eVar.a(e, kVar.d);
        eVar.a(f, kVar.e);
        eVar.c(g, kVar.f);
        eVar.a(h, kVar.g);
    }
}
