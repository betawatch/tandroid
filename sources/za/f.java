package za;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = ia.c.c("processName");
    public static final ia.c c = ia.c.c("pid");
    public static final ia.c d = ia.c.c("importance");
    public static final ia.c e = ia.c.c("defaultProcess");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        q qVar = (q) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, qVar.a);
        eVar.e(c, qVar.b);
        eVar.e(d, qVar.c);
        eVar.c(e, qVar.d);
    }
}
