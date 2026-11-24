// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p60 implements cq7 {
    public static final p60 a = new p60();
    public static final wa4 b = wa4.c("arch");
    public static final wa4 c = wa4.c("libraryName");
    public static final wa4 d = wa4.c("buildId");

    @Override // b44
    public final void a(Object obj, Object obj2) {
        rz2 rz2Var = (rz2) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((e90) rz2Var).a);
        e90 e90Var = (e90) rz2Var;
        dq7Var.a(c, e90Var.b);
        dq7Var.a(d, e90Var.c);
    }
}
