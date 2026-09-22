package za;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
