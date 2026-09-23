package za;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
