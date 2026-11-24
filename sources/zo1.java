// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zo1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pz b;

    public /* synthetic */ zo1(pz pzVar, byte b) {
        this.a = b;
        this.b = pzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pz pzVar = this.b;
        switch (b) {
            case 0:
                gm.E3(pzVar);
                break;
            default:
                lf8 lf8Var = (lf8) pzVar.f2;
                rc2 rc2Var = lf8Var.n;
                if (rc2Var != null && rc2Var.getDelegate() != null) {
                    lf8Var.n.getDelegate().o1(lf8Var.n, false);
                    break;
                }
                break;
        }
    }
}
