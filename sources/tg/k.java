package tg;

import android.view.View;
import di.ba;
import di.ta;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (!g0Var.D0) {
                    g0Var.B0(0);
                    break;
                } else {
                    g0Var.r0(null, true);
                    break;
                }
            case 1:
                g0 g0Var2 = this.b;
                int i7 = g0Var2.Q0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                v vVar = new v(g0Var2.getContext(), g0Var2.A1, false, false);
                vVar.z1 = new q(g0Var2);
                vVar.O0(new ta(g0Var2, 4));
                vVar.setOnDismissListener(new ba(g0Var2, i7));
                vVar.show();
                g0Var2.o0(true);
                break;
            case 2:
                g0 g0Var3 = this.b;
                j jVar = g0Var3.C0;
                if ((jVar instanceof m2) && !g0Var3.D0) {
                    m2 m2Var = (m2) jVar;
                    g0Var3.D0 = true;
                    m2Var.q();
                    View focusedView = m2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.I3(focusedView);
                }
                org.telegram.ui.ActionBar.h1 h1Var = g0Var3.B1;
                if (h1Var != null && h1Var.isShowing()) {
                    g0Var3.B1.d(true);
                    break;
                }
                break;
            case 3:
                g0.Z(this.b);
                break;
            default:
                g0 g0Var4 = this.b;
                g0Var4.B0(2);
                if (!(g0Var4.C0 instanceof m2)) {
                    g0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
