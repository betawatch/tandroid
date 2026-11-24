// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pg8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xg8 b;

    public /* synthetic */ pg8(xg8 xg8Var, boolean z) {
        this.a = (byte) 0;
        this.b = xg8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xg8 xg8Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new pg8(xg8Var, (byte) 3));
                rc2 rc2Var = xg8Var.M;
                if (rc2Var != null) {
                    rc2Var.setVisibility(0);
                    rc2 rc2Var2 = xg8Var.M;
                    rc2Var2.d6 = null;
                    rc2Var2.invalidate();
                }
                ru1 ru1Var = xg8Var.f0;
                if (ru1Var != null) {
                    gm.c3(ru1Var);
                    xg8Var.f0 = null;
                    break;
                }
                break;
            case 1:
                xg8Var.b(false);
                break;
            case 2:
                xg8Var.b(false);
                break;
            default:
                xg8Var.c();
                break;
        }
    }

    public /* synthetic */ pg8(xg8 xg8Var, byte b) {
        this.a = b;
        this.b = xg8Var;
    }
}
