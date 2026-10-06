package za;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
