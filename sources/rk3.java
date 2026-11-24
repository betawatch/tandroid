// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rk3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zk3 b;

    public /* synthetic */ rk3(zk3 zk3Var, byte b) {
        this.a = b;
        this.b = zk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zk3 zk3Var = this.b;
        switch (b) {
            case 0:
                for (mk3 mk3Var : zk3Var.S.f0) {
                    ((u46) mk3Var.a.getLayoutManager()).u = false;
                }
                break;
            default:
                zk3Var.K();
                break;
        }
    }
}
