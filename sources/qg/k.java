package qg;

import android.view.View;
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ k(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                if (!m0Var.T0) {
                    m0Var.C0(0);
                    break;
                } else {
                    m0Var.s0(null, true);
                    break;
                }
            case 1:
                m0 m0Var2 = this.b;
                int i10 = m0Var2.g1;
                m0Var2.C0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                w wVar = new w(m0Var2.getContext(), m0Var2.Q1, false, false);
                wVar.y = new q(m0Var2);
                wVar.r0(new x7(m0Var2, 3));
                wVar.setOnDismissListener(new s(m0Var2, i10));
                wVar.show();
                PhotoViewer photoViewer = ((bu0) m0Var2).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                m0 m0Var3 = this.b;
                j jVar = m0Var3.S0;
                if ((jVar instanceof w2) && !m0Var3.T0) {
                    w2 w2Var = (w2) jVar;
                    m0Var3.T0 = true;
                    w2Var.q();
                    View focusedView = w2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = m0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    m0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                m0.b0(this.b);
                break;
            default:
                m0 m0Var4 = this.b;
                m0Var4.C0(2);
                if (!(m0Var4.S0 instanceof w2)) {
                    m0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
