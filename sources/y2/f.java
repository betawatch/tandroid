package y2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements s9.d {
    public static final f a = new f();
    public static final s9.c b = new s9.c("currentCacheSizeBytes", u3.c.h(u3.c.g(v9.d.class, new v9.a(1))));
    public static final s9.c c = new s9.c("maxCacheSizeBytes", u3.c.h(u3.c.g(v9.d.class, new v9.a(2))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        b3.f fVar = (b3.f) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.c(b, fVar.a);
        eVar.c(c, fVar.b);
    }
}
