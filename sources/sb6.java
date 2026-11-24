// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc6 b;

    public /* synthetic */ sb6(pc6 pc6Var, byte b) {
        this.a = b;
        this.b = pc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        pc6 pc6Var = this.b;
        switch (b) {
            case 0:
                pc6Var.u0();
                break;
            case 1:
                pj5 pj5Var = pc6Var.G;
                if (pj5Var != null) {
                    pc6Var.F.h(pj5Var);
                    pc6Var.G = null;
                    break;
                }
                break;
            case 2:
                pc6Var.x0();
                break;
            case 3:
                pc6Var.getLocationController().o(0, pc6Var.m0, true);
                pc6Var.y = false;
                break;
            case 4:
                s05 s05Var = pc6Var.F;
                if (s05Var != null) {
                    s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), pc6Var.o0());
                }
                if (!pc6Var.O.getRadiusSet()) {
                    double d = pc6Var.M;
                    mj4 mj4Var = pc6Var.L;
                    if (d > 0.0d) {
                        mj4Var.A(d);
                    } else if (mj4Var != null) {
                        mj4Var.y();
                        pc6Var.L = null;
                    }
                }
                pc6Var.O = null;
                break;
            case 5:
                pc6Var.D0();
                break;
            case 6:
                pc6Var.D0();
                break;
            default:
                gm.c3(new sb6(pc6Var, b2));
                break;
        }
    }
}
