// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rj0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak0 b;

    public /* synthetic */ rj0(ak0 ak0Var, byte b) {
        this.a = b;
        this.b = ak0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ak0 ak0Var = this.b;
        switch (b) {
            case 0:
                lk0 lk0Var = ak0Var.m0;
                dqd dqdVar = lk0Var.c;
                if (dqdVar == null) {
                    dqdVar = new ik0();
                    lk0Var.c = dqdVar;
                }
                dqdVar.b();
                break;
            default:
                ak0Var.m0.u = false;
                break;
        }
    }
}
