package pg;

import android.view.View;
import bi.c9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    m0Var.B0(0);
                    break;
                } else {
                    m0Var.r0(null, true);
                    break;
                }
            case 1:
                m0 m0Var2 = this.b;
                int i10 = m0Var2.g1;
                m0Var2.B0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                w wVar = new w(m0Var2.getContext(), m0Var2.Q1, false, false);
                wVar.y = new q(m0Var2);
                wVar.q0(new c9(m0Var2, 3));
                wVar.setOnDismissListener(new s(m0Var2, i10));
                wVar.show();
                PhotoViewer photoViewer = ((zt0) m0Var2).o2;
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
                org.telegram.ui.ActionBar.p1 p1Var = m0Var3.R1;
                if (p1Var != null && p1Var.isShowing()) {
                    m0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                m0.b0(this.b);
                break;
            default:
                m0 m0Var4 = this.b;
                m0Var4.B0(2);
                if (!(m0Var4.S0 instanceof v2)) {
                    m0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
