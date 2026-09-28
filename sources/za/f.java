package za;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
