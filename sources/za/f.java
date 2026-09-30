package za;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
