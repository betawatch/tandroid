package za;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = ia.c.c("processName");
    public static final ia.c c = ia.c.c("pid");
    public static final ia.c d = ia.c.c("importance");
    public static final ia.c e = ia.c.c("defaultProcess");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        r rVar = (r) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, rVar.a);
        eVar.e(c, rVar.b);
        eVar.e(d, rVar.c);
        eVar.c(e, rVar.d);
    }
}
