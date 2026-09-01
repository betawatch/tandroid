package y2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f implements u9.d {
    public static final f a = new f();
    public static final u9.c b = new u9.c("currentCacheSizeBytes", w.c.h(w.c.g(x9.d.class, new x9.a(1))));
    public static final u9.c c = new u9.c("maxCacheSizeBytes", w.c.h(w.c.g(x9.d.class, new x9.a(2))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        b3.f fVar = (b3.f) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.b(b, fVar.a);
        eVar.b(c, fVar.b);
    }
}
