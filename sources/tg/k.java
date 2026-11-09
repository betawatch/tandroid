package tg;

import android.view.View;
import bi.fc;
import bi.mb;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ k(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                if (!g0Var.C0) {
                    g0Var.B0(0);
                    break;
                } else {
                    g0Var.r0(null, true);
                    break;
                }
            case 1:
                g0 g0Var2 = this.b;
                int i7 = g0Var2.P0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                v vVar = new v(g0Var2.getContext(), g0Var2.z1, false, false);
                vVar.v1 = new q(g0Var2);
                vVar.N0(new fc(g0Var2, 4));
                vVar.setOnDismissListener(new mb(g0Var2, i7));
                vVar.show();
                g0Var2.o0(true);
                break;
            case 2:
                g0 g0Var3 = this.b;
                j jVar = g0Var3.B0;
                if ((jVar instanceof k2) && !g0Var3.C0) {
                    k2 k2Var = (k2) jVar;
                    g0Var3.C0 = true;
                    k2Var.q();
                    View focusedView = k2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.K3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = g0Var3.A1;
                if (g1Var != null && g1Var.isShowing()) {
                    g0Var3.A1.d(true);
                    break;
                }
                break;
            case 3:
                g0.Z(this.b);
                break;
            default:
                g0 g0Var4 = this.b;
                g0Var4.B0(2);
                if (!(g0Var4.B0 instanceof k2)) {
                    g0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
