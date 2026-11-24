// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wr1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xr1 b;

    public /* synthetic */ wr1(xr1 xr1Var, byte b) {
        this.a = b;
        this.b = xr1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xr1 xr1Var = this.b;
        switch (b) {
            case 0:
                xr1Var.W = null;
                yv1 yv1Var = xr1Var.X;
                if (yv1Var.ea != -1) {
                    yv1Var.getNotificationCenter().j(yv1Var.ea);
                    yv1Var.ea = -1;
                }
                if (e21.a) {
                    fc4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                xr1Var.W = null;
                yv1 yv1Var2 = xr1Var.X;
                if (yv1Var2.ea != -1) {
                    yv1Var2.getNotificationCenter().j(yv1Var2.ea);
                    yv1Var2.ea = -1;
                }
                if (e21.a) {
                    fc4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
