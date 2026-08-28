package w2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements q9.d {
    public static final f a = new f();
    public static final q9.c b = new q9.c("currentCacheSizeBytes", ta.b.g(ta.b.f(t9.d.class, new t9.a(1))));
    public static final q9.c c = new q9.c("maxCacheSizeBytes", ta.b.g(ta.b.f(t9.d.class, new t9.a(2))));

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        z2.f fVar = (z2.f) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.d(b, fVar.a);
        eVar.d(c, fVar.b);
    }
}
