package sg;

import android.view.View;
import bi.dc;
import bi.pb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                if (!n0Var.I0) {
                    n0Var.A0(0);
                    break;
                } else {
                    n0Var.q0(null, true);
                    break;
                }
            case 1:
                n0 n0Var2 = this.b;
                int i10 = n0Var2.V0;
                n0Var2.A0(1);
                n0Var2.postDelayed(new n(n0Var2, 1), 350L);
                x xVar = new x(n0Var2.getContext(), n0Var2.F1, false, false);
                xVar.E = new q(n0Var2);
                xVar.s0(new dc(n0Var2, 4));
                xVar.setOnDismissListener(new pb(n0Var2, i10));
                xVar.show();
                PhotoViewer photoViewer = ((nt0) n0Var2).d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                n0 n0Var3 = this.b;
                j jVar = n0Var3.H0;
                if ((jVar instanceof x2) && !n0Var3.I0) {
                    x2 x2Var = (x2) jVar;
                    n0Var3.I0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = n0Var3.G1;
                if (o1Var != null && o1Var.isShowing()) {
                    n0Var3.G1.d(true);
                    break;
                }
                break;
            case 3:
                n0.Z(this.b);
                break;
            default:
                n0 n0Var4 = this.b;
                n0Var4.A0(2);
                if (!(n0Var4.H0 instanceof x2)) {
                    n0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
