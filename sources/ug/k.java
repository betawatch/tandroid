package ug;

import android.view.View;
import ci.ab;
import ci.ja;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ k(f0 f0Var, int i3) {
        this.a = i3;
        this.b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.D0) {
                    f0Var.B0(0);
                    break;
                } else {
                    f0Var.r0(null, true);
                    break;
                }
            case 1:
                f0 f0Var2 = this.b;
                int i3 = f0Var2.Q0;
                f0Var2.B0(1);
                f0Var2.postDelayed(new n(f0Var2, 1), 350L);
                v vVar = new v(f0Var2.getContext(), f0Var2.A1, false, false);
                vVar.w1 = new q(f0Var2);
                vVar.N0(new ab(f0Var2, 4));
                vVar.setOnDismissListener(new ja(f0Var2, i3));
                vVar.show();
                f0Var2.o0(true);
                break;
            case 2:
                f0 f0Var3 = this.b;
                j jVar = f0Var3.C0;
                if ((jVar instanceof l2) && !f0Var3.D0) {
                    l2 l2Var = (l2) jVar;
                    f0Var3.D0 = true;
                    l2Var.q();
                    View focusedView = l2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.K3(focusedView);
                }
                org.telegram.ui.ActionBar.f1 f1Var = f0Var3.B1;
                if (f1Var != null && f1Var.isShowing()) {
                    f0Var3.B1.d(true);
                    break;
                }
                break;
            case 3:
                f0.Z(this.b);
                break;
            default:
                f0 f0Var4 = this.b;
                f0Var4.B0(2);
                if (!(f0Var4.C0 instanceof l2)) {
                    f0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
