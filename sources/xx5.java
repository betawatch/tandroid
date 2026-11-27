// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xx5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wy5 b;

    public /* synthetic */ xx5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                if (!wy5Var.D0) {
                    wy5Var.E0(0);
                    break;
                } else {
                    wy5Var.t0(null, true);
                    break;
                }
            case 1:
                int i = wy5Var.Q0;
                wy5Var.E0(1);
                wy5Var.postDelayed(new by5(wy5Var, b3), 350L);
                ly5 ly5Var = new ly5(wy5Var, wy5Var.getContext(), wy5Var.A1);
                wy5Var.K1 = ly5Var;
                ly5Var.y1 = new ey5(wy5Var);
                ly5Var.K0(new p12(wy5Var, (byte) 4));
                ly5Var.setOnDismissListener(new gy5(wy5Var, ly5Var, i, b2));
                ly5Var.show();
                wy5Var.q0(true);
                break;
            case 2:
                wy5Var.g0();
                n8 n8Var = wy5Var.B1;
                if (n8Var != null && n8Var.isShowing()) {
                    wy5Var.B1.d(true);
                    break;
                }
                break;
            case 3:
                wy5Var.n0();
                break;
            default:
                wy5Var.E0(2);
                if (!(wy5Var.C0 instanceof rlb)) {
                    wy5Var.f0(true);
                    break;
                }
                break;
        }
    }
}
