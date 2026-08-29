package x2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements s9.d {
    public static final e a = new e();
    public static final s9.c b = s9.c.c("eventTimeMs");
    public static final s9.c c = s9.c.c("eventCode");
    public static final s9.c d = s9.c.c("eventUptimeMs");
    public static final s9.c e = s9.c.c("sourceExtension");
    public static final s9.c f = s9.c.c("sourceExtensionJsonProto3");
    public static final s9.c g = s9.c.c("timezoneOffsetSeconds");
    public static final s9.c h = s9.c.c("networkConnectionInfo");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.c(b, kVar.a);
        eVar.e(c, kVar.b);
        eVar.c(d, kVar.c);
        eVar.e(e, kVar.d);
        eVar.e(f, kVar.e);
        eVar.c(g, kVar.f);
        eVar.e(h, kVar.g);
    }
}
