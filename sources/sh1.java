// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sh1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh1 b;

    public /* synthetic */ sh1(yh1 yh1Var, byte b) {
        this.a = b;
        this.b = yh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        yh1 yh1Var = this.b;
        switch (b) {
            case 0:
                yh1Var.g0(view);
                break;
            case 1:
                yh1Var.x.n(yh1Var.E != null, new oh1(yh1Var, (byte) 2), new n1(yh1Var, (byte) 11), 0);
                yh1Var.L.H(0);
                yh1Var.L.K(43);
                yh1Var.n.d();
                break;
            case 2:
                if (!yh1Var.l0) {
                    yh1Var.k0();
                    break;
                } else if (yh1Var.c0) {
                    yh1Var.c0 = false;
                    yh1Var.m0();
                    break;
                }
                break;
            default:
                if (!yh1Var.c0) {
                    yh1Var.c0 = true;
                    yh1Var.m0();
                    break;
                }
                break;
        }
    }
}
