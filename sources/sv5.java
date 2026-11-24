// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sv5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw5 b;

    public /* synthetic */ sv5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                if (!rw5Var.J0) {
                    rw5Var.E0(0);
                    break;
                } else {
                    rw5Var.t0(null, true);
                    break;
                }
            case 1:
                int i = rw5Var.W0;
                rw5Var.E0(1);
                rw5Var.postDelayed(new wv5(rw5Var, b3), 350L);
                gw5 gw5Var = new gw5(rw5Var, rw5Var.getContext(), rw5Var.G1);
                rw5Var.Q1 = gw5Var;
                gw5Var.y1 = new zv5(rw5Var);
                gw5Var.J0(new z02(rw5Var, (byte) 4));
                gw5Var.setOnDismissListener(new bw5(rw5Var, gw5Var, i, b2));
                gw5Var.show();
                rw5Var.q0(true);
                break;
            case 2:
                rw5Var.g0();
                m8 m8Var = rw5Var.H1;
                if (m8Var != null && m8Var.isShowing()) {
                    rw5Var.H1.d(true);
                    break;
                }
                break;
            case 3:
                rw5Var.n0();
                break;
            default:
                rw5Var.E0(2);
                if (!(rw5Var.I0 instanceof vhb)) {
                    rw5Var.f0(true);
                    break;
                }
                break;
        }
    }
}
