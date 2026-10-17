package z9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class l implements ja.d {
    public static final l a = new l();
    public static final ja.c b = ja.c.c("baseAddress");
    public static final ja.c c = ja.c.c("size");
    public static final ja.c d = ja.c.c("name");
    public static final ja.c e = ja.c.c("uuid");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(b, o0Var.a);
        eVar.f(c, o0Var.b);
        eVar.d(d, o0Var.c);
        String str = o0Var.d;
        eVar.d(e, str != null ? str.getBytes(e2.a) : null);
    }
}
