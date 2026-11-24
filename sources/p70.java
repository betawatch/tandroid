// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p70 implements cq7 {
    public static final p70 a = new p70();
    public static final wa4 b = wa4.c("platform");
    public static final wa4 c = wa4.c("version");
    public static final wa4 d = wa4.c("buildVersion");
    public static final wa4 e = wa4.c("jailbroken");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        p03 p03Var = (p03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.e(b, ((ka0) p03Var).a);
        ka0 ka0Var = (ka0) p03Var;
        dq7Var.a(c, ka0Var.b);
        dq7Var.a(d, ka0Var.c);
        dq7Var.d(e, ka0Var.d);
    }
}
