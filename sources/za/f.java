package za;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
