// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xq7 implements sb1 {
    public final zp4 a;
    public final /* synthetic */ yq7 b;

    public xq7(yq7 yq7Var, zp4 zp4Var) {
        this.b = yq7Var;
        this.a = zp4Var;
    }

    @Override // sb1
    public final void cancel() {
        yq7 yq7Var = this.b;
        lt ltVar = yq7Var.b;
        zp4 zp4Var = this.a;
        ltVar.remove(zp4Var);
        if (rr5.a(yq7Var.c, zp4Var)) {
            zp4Var.a();
            yq7Var.c = null;
        }
        zp4Var.b.remove(this);
        pr4 pr4Var = zp4Var.c;
        if (pr4Var != null) {
            pr4Var.invoke();
        }
        zp4Var.c = null;
    }
}
