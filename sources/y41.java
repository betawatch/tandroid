// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y41 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f51 b;

    public /* synthetic */ y41(f51 f51Var, byte b) {
        this.a = b;
        this.b = f51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f51 f51Var = this.b;
        switch (b) {
            case 0:
                f51Var.j0();
                break;
            case 1:
                f51Var.n0();
                break;
            default:
                y41 y41Var = f51Var.e;
                gm.r(y41Var);
                gm.d3(y41Var, 5000L);
                break;
        }
    }
}
