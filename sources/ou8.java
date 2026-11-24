// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ou8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu8 b;

    public /* synthetic */ ou8(uu8 uu8Var, byte b) {
        this.a = b;
        this.b = uu8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uu8 uu8Var = this.b;
        switch (b) {
            case 0:
                uu8Var.e0 = true;
                break;
            case 1:
                uu8Var.u();
                break;
            default:
                if (!uu8Var.k0) {
                    st6 st6Var = uu8Var.J;
                    st6Var.getClass();
                    st6Var.b(uu8Var);
                    break;
                }
                break;
        }
    }
}
