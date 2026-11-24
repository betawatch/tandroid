// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa6 b;

    public /* synthetic */ t96(qa6 qa6Var, byte b) {
        this.a = b;
        this.b = qa6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        qa6 qa6Var = this.b;
        switch (b) {
            case 0:
                qa6Var.t0();
                break;
            case 1:
                qh5 qh5Var = qa6Var.G;
                if (qh5Var != null) {
                    qa6Var.F.h(qh5Var);
                    qa6Var.G = null;
                    break;
                }
                break;
            case 2:
                qa6Var.w0();
                break;
            case 3:
                qa6Var.getLocationController().o(0, qa6Var.m0, true);
                qa6Var.y = false;
                break;
            case 4:
                ty4 ty4Var = qa6Var.F;
                if (ty4Var != null) {
                    ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), qa6Var.n0());
                }
                if (!qa6Var.O.getRadiusSet()) {
                    double d = qa6Var.M;
                    sk4 sk4Var = qa6Var.L;
                    if (d > 0.0d) {
                        sk4Var.n0(d);
                    } else if (sk4Var != null) {
                        sk4Var.j0();
                        qa6Var.L = null;
                    }
                }
                qa6Var.O = null;
                break;
            case 5:
                qa6Var.C0();
                break;
            case 6:
                qa6Var.C0();
                break;
            default:
                gl.d3(new t96(qa6Var, b2));
                break;
        }
    }
}
