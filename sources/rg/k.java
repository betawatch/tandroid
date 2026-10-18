package rg;

import ai.jc;
import ai.qb;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                v vVar = new v(m0Var2.getContext(), m0Var2.Q1, false, false);
                vVar.y = new q(m0Var2);
                vVar.r0(new jc(m0Var2, 4));
                vVar.setOnDismissListener(new qb(m0Var2, i10));
                vVar.show();
                PhotoViewer photoViewer = ((it0) m0Var2).o2;
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
                if ((jVar instanceof v2) && !m0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    m0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.m1 m1Var = m0Var3.R1;
                if (m1Var != null && m1Var.isShowing()) {
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
                if (!(m0Var4.S0 instanceof v2)) {
                    m0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
