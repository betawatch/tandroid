package w2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements r9.d {
    public static final f a = new f();
    public static final r9.c b = new r9.c("currentCacheSizeBytes", s3.c.h(s3.c.g(u9.d.class, new u9.a(1))));
    public static final r9.c c = new r9.c("maxCacheSizeBytes", s3.c.h(s3.c.g(u9.d.class, new u9.a(2))));

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        z2.f fVar = (z2.f) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.c(b, fVar.a);
        eVar.c(c, fVar.b);
    }
}
