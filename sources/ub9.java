// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ub9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yb9 b;

    public /* synthetic */ ub9(yb9 yb9Var, byte b) {
        this.a = b;
        this.b = yb9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yb9 yb9Var = this.b;
        switch (b) {
            case 0:
                yb9Var.Y0();
                break;
            default:
                yb9Var.d2.O(true);
                gm.d3(new ub9(yb9Var, (byte) 0), 150L);
                break;
        }
    }
}
