package y2;

import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements u9.d {
    public static final f a = new f();
    public static final u9.c b = new u9.c("currentCacheSizeBytes", w2.h(w2.g(x9.d.class, new x9.a(1))));
    public static final u9.c c = new u9.c("maxCacheSizeBytes", w2.h(w2.g(x9.d.class, new x9.a(2))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        b3.f fVar = (b3.f) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.b(b, fVar.a);
        eVar.b(c, fVar.b);
    }
}
