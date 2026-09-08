package rg;

import android.view.View;
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ l(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                if (!o0Var.T0) {
                    o0Var.B0(0);
                    break;
                } else {
                    o0Var.r0(null, true);
                    break;
                }
            case 1:
                o0 o0Var2 = this.b;
                int i10 = o0Var2.g1;
                o0Var2.B0(1);
                o0Var2.postDelayed(new o(o0Var2, 1), 350L);
                x xVar = new x(o0Var2.getContext(), o0Var2.Q1, false, false);
                xVar.y = new r(o0Var2);
                xVar.q0(new a8(o0Var2, 3));
                xVar.setOnDismissListener(new t(o0Var2, i10));
                xVar.show();
                PhotoViewer photoViewer = ((zt0) o0Var2).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                o0 o0Var3 = this.b;
                k kVar = o0Var3.S0;
                if ((kVar instanceof x2) && !o0Var3.T0) {
                    x2 x2Var = (x2) kVar;
                    o0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = o0Var3.R1;
                if (n1Var != null && n1Var.isShowing()) {
                    o0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                o0.b0(this.b);
                break;
            default:
                o0 o0Var4 = this.b;
                o0Var4.B0(2);
                if (!(o0Var4.S0 instanceof x2)) {
                    o0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
