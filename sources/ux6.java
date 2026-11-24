// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ux6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ly6 b;

    public /* synthetic */ ux6(ly6 ly6Var, byte b) {
        this.a = b;
        this.b = ly6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                ly6Var.m0(new ux6(ly6Var, (byte) 1));
                break;
            default:
                ly6Var.p0();
                break;
        }
    }
}
