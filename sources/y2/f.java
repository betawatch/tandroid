package y2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
