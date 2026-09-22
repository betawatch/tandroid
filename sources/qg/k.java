package qg;

import android.view.View;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ k(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                if (!n0Var.T0) {
                    n0Var.B0(0);
                    break;
                } else {
                    n0Var.r0(null, true);
                    break;
                }
            case 1:
                n0 n0Var2 = this.b;
                int i10 = n0Var2.g1;
                n0Var2.B0(1);
                n0Var2.postDelayed(new n(n0Var2, 1), 350L);
                x xVar = new x(n0Var2.getContext(), n0Var2.Q1, false, false);
                xVar.y = new q(n0Var2);
                xVar.q0(new a8(n0Var2, 3));
                xVar.setOnDismissListener(new s(n0Var2, i10));
                xVar.show();
                PhotoViewer photoViewer = ((au0) n0Var2).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                n0 n0Var3 = this.b;
                j jVar = n0Var3.S0;
                if ((jVar instanceof v2) && !n0Var3.T0) {
                    v2 v2Var = (v2) jVar;
                    n0Var3.T0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = n0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    n0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                n0.b0(this.b);
                break;
            default:
                n0 n0Var4 = this.b;
                n0Var4.B0(2);
                if (!(n0Var4.S0 instanceof v2)) {
                    n0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
