// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ah7 b;

    public /* synthetic */ zg7(ah7 ah7Var, byte b) {
        this.a = b;
        this.b = ah7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ah7 ah7Var = this.b;
        switch (b) {
            case 0:
                ah7Var.x();
                break;
            default:
                ah7Var.m(true);
                break;
        }
    }
}
