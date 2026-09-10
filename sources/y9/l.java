package y9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l implements ia.d {
    public static final l a = new l();
    public static final ia.c b = ia.c.c("baseAddress");
    public static final ia.c c = ia.c.c("size");
    public static final ia.c d = ia.c.c("name");
    public static final ia.c e = ia.c.c("uuid");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.f(b, o0Var.a);
        eVar.f(c, o0Var.b);
        eVar.a(d, o0Var.c);
        String str = o0Var.d;
        eVar.a(e, str != null ? str.getBytes(e2.a) : null);
    }
}
