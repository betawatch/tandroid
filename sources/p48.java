// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class p48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v48 b;

    public /* synthetic */ p48(v48 v48Var, byte b) {
        this.a = b;
        this.b = v48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                ((fab) v48Var.x.G1).g(false);
                break;
            case 1:
                a58 a58Var = v48Var.x;
                w48 w48Var = a58Var.G1;
                if (w48Var != null) {
                    oab oabVar = ((fab) w48Var).d;
                    oabVar.Z0 = false;
                    oabVar.U();
                }
                a58Var.c1(false);
                a58Var.X2 = true;
                a58Var.A0.E(true);
                break;
            case 2:
                a58 a58Var2 = v48Var.x;
                a58Var2.J3 = true;
                a58Var2.setActive(false);
                break;
            default:
                a58 a58Var3 = v48Var.x;
                a58Var3.J3 = true;
                a58Var3.setActive(false);
                break;
        }
    }
}
