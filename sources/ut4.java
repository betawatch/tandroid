// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xt4 b;

    public /* synthetic */ ut4(xt4 xt4Var, byte b) {
        this.a = b;
        this.b = xt4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xt4 xt4Var = this.b;
        switch (b) {
            case 0:
                xt4Var.dismiss();
                break;
            default:
                xt4Var.E0();
                break;
        }
    }
}
