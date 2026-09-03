package x2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
