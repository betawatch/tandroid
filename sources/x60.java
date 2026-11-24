// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x60 implements cq7 {
    public static final x60 a = new x60();
    public static final wa4 b = wa4.c("identifier");
    public static final wa4 c = wa4.c("version");
    public static final wa4 d = wa4.c("displayVersion");
    public static final wa4 e = wa4.c("organization");
    public static final wa4 f = wa4.c("installationUuid");
    public static final wa4 g = wa4.c("developmentPlatform");
    public static final wa4 h = wa4.c("developmentPlatformVersion");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        zz2 zz2Var = (zz2) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((m90) zz2Var).a);
        m90 m90Var = (m90) zz2Var;
        dq7Var.a(c, m90Var.b);
        dq7Var.a(d, m90Var.c);
        dq7Var.a(e, null);
        dq7Var.a(f, m90Var.d);
        dq7Var.a(g, m90Var.e);
        dq7Var.a(h, m90Var.f);
    }
}
