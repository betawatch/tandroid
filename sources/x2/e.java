package x2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e implements u9.d {
    public static final e a = new e();
    public static final u9.c b = u9.c.c("eventTimeMs");
    public static final u9.c c = u9.c.c("eventCode");
    public static final u9.c d = u9.c.c("eventUptimeMs");
    public static final u9.c e = u9.c.c("sourceExtension");
    public static final u9.c f = u9.c.c("sourceExtensionJsonProto3");
    public static final u9.c g = u9.c.c("timezoneOffsetSeconds");
    public static final u9.c h = u9.c.c("networkConnectionInfo");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.b(b, kVar.a);
        eVar.e(c, kVar.b);
        eVar.b(d, kVar.c);
        eVar.e(e, kVar.d);
        eVar.e(f, kVar.e);
        eVar.b(g, kVar.f);
        eVar.e(h, kVar.g);
    }
}
