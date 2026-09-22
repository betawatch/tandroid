package za;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = ia.c.c("processName");
    public static final ia.c c = ia.c.c("pid");
    public static final ia.c d = ia.c.c("importance");
    public static final ia.c e = ia.c.c("defaultProcess");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        p pVar = (p) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, pVar.a);
        eVar.e(c, pVar.b);
        eVar.e(d, pVar.c);
        eVar.c(e, pVar.d);
    }
}
