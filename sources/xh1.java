// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xh1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gi1 b;

    public /* synthetic */ xh1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                gi1Var.l0(true);
                break;
            case 1:
                gi1Var.l0 = true;
                gi1Var.m0();
                break;
            case 2:
                gi1Var.E = null;
                gi1Var.F = null;
                gi1Var.n0 = null;
                gi1Var.o0 = null;
                gi1Var.q0 = null;
                gi1Var.p0 = null;
                gi1Var.r0 = 0.0d;
                gi1Var.i0(false, true);
                gi1Var.f.m(null, null, gi1Var.w, null);
                gi1Var.n.setAnimation(gi1Var.L);
                gi1Var.L.H(0);
                break;
            default:
                gi1Var.l0 = true;
                if (gi1Var.y.length() > 0) {
                    gi1Var.d0(gi1Var.y.getText().toString());
                }
                gi1Var.m0();
                break;
        }
    }
}
