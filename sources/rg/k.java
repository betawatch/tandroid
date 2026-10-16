package rg;

import android.view.View;
import di.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ k(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                if (!o0Var.T0) {
                    o0Var.C0(0);
                    break;
                } else {
                    o0Var.s0(null, true);
                    break;
                }
            case 1:
                o0 o0Var2 = this.b;
                int i10 = o0Var2.g1;
                o0Var2.C0(1);
                o0Var2.postDelayed(new n(o0Var2, 1), 350L);
                w wVar = new w(o0Var2.getContext(), o0Var2.Q1, false, false);
                wVar.y = new q(o0Var2);
                wVar.r0(new w7(o0Var2, 3));
                wVar.setOnDismissListener(new s(o0Var2, i10));
                wVar.show();
                PhotoViewer photoViewer = ((gu0) o0Var2).o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                o0 o0Var3 = this.b;
                j jVar = o0Var3.S0;
                if ((jVar instanceof x2) && !o0Var3.T0) {
                    x2 x2Var = (x2) jVar;
                    o0Var3.T0 = true;
                    x2Var.q();
                    View focusedView = x2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.m1 m1Var = o0Var3.R1;
                if (m1Var != null && m1Var.isShowing()) {
                    o0Var3.R1.d(true);
                    break;
                }
                break;
            case 3:
                o0.b0(this.b);
                break;
            default:
                o0 o0Var4 = this.b;
                o0Var4.C0(2);
                if (!(o0Var4.S0 instanceof x2)) {
                    o0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
