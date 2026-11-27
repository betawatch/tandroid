// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sv8 b;

    public /* synthetic */ ov8(sv8 sv8Var, byte b) {
        this.a = b;
        this.b = sv8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sv8 sv8Var = this.b;
        switch (b) {
            case 0:
                if (!sv8Var.T && !sv8Var.S) {
                    sv8Var.a(1.0f);
                    break;
                }
                break;
            default:
                if (!sv8Var.T && !sv8Var.S) {
                    uk0.c(sv8Var.F, sv8Var.h);
                    sv8Var.G.d();
                    frc frcVar = sv8Var.r;
                    ov8 ov8Var = new ov8(sv8Var, (byte) 0);
                    zqc zqcVar = frcVar.E;
                    if (zqcVar == null) {
                        ov8Var.run();
                        break;
                    } else if (zqcVar.b == null) {
                        zqcVar.d = ov8Var;
                        break;
                    } else {
                        ov8Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
