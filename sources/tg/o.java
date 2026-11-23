package tg;

import android.view.View;
import di.ta;
import hi.a5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ o(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                if (!l0Var.D0) {
                    l0Var.F0(0);
                    break;
                } else {
                    l0Var.u0(null, true);
                    break;
                }
            case 1:
                l0 l0Var2 = this.b;
                int i7 = l0Var2.Q0;
                l0Var2.F0(1);
                l0Var2.postDelayed(new t(l0Var2, 1), 350L);
                b0 b0Var = new b0(l0Var2, l0Var2.getContext(), l0Var2.A1);
                l0Var2.K1 = b0Var;
                b0Var.z1 = new w(l0Var2);
                b0Var.P0(new ta(l0Var2, 4));
                b0Var.setOnDismissListener(new a5(l0Var2, b0Var, i7, 1));
                b0Var.show();
                l0Var2.r0(true);
                break;
            case 2:
                l0 l0Var3 = this.b;
                l0Var3.k0();
                org.telegram.ui.ActionBar.g1 g1Var = l0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    l0Var3.B1.d(true);
                    break;
                }
                break;
            case 3:
                l0.Y(this.b);
                break;
            default:
                l0 l0Var4 = this.b;
                l0Var4.F0(2);
                if (!(l0Var4.C0 instanceof q2)) {
                    l0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
