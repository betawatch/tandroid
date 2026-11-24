// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vp5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yp5 b;

    public /* synthetic */ vp5(yp5 yp5Var, byte b) {
        this.a = b;
        this.b = yp5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yp5 yp5Var = this.b;
        switch (b) {
            case 0:
                u11 u11Var = yp5Var.A;
                if (u11Var != null) {
                    yp5Var.a.g(u11Var);
                    yp5Var.A = null;
                    break;
                }
                break;
            default:
                yp5Var.a(null, true, null);
                break;
        }
    }
}
