package qg;

import android.view.View;
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ k(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                if (!p0Var.T0) {
                    p0Var.B0(0);
                    break;
                } else {
                    p0Var.r0(null, true);
                    break;
                }
            case 1:
                p0 p0Var2 = this.b;
                int i10 = p0Var2.g1;
                p0Var2.B0(1);
                p0Var2.postDelayed(new n(p0Var2, 1), 350L);
                x xVar = new x(p0Var2.getContext(), p0Var2.Q1, false, false);
                xVar.y = new q(p0Var2);
                xVar.q0(new a8(p0Var2, 3));
                xVar.setOnDismissListener(new s(p0Var2, i10));
                xVar.show();
                PhotoViewer photoViewer = ((cu0) p0Var2).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                p0 p0Var3 = this.b;
                j jVar = p0Var3.S0;
                if ((jVar instanceof x2) && !p0Var3.T0) {
                    x2 x2Var = (x2) jVar;
                    p0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = p0Var3.R1;
                if (o1Var != null && o1Var.isShowing()) {
                    p0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                p0.b0(this.b);
                break;
            default:
                p0 p0Var4 = this.b;
                p0Var4.B0(2);
                if (!(p0Var4.S0 instanceof x2)) {
                    p0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
