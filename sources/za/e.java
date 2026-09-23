package za;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e implements ia.d {
    public static final e a = new e();
    public static final ia.c b = ia.c.c("performance");
    public static final ia.c c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, jVar.a);
        eVar.a(c, jVar.b);
        eVar.g(d, jVar.c);
    }
}
