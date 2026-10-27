package sg;

import android.view.View;
import bi.dc;
import bi.pb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                if (!m0Var.I0) {
                    m0Var.A0(0);
                    break;
                } else {
                    m0Var.q0(null, true);
                    break;
                }
            case 1:
                m0 m0Var2 = this.b;
                int i10 = m0Var2.V0;
                m0Var2.A0(1);
                m0Var2.postDelayed(new n(m0Var2, 1), 350L);
                w wVar = new w(m0Var2.getContext(), m0Var2.F1, false, false);
                wVar.E = new q(m0Var2);
                wVar.s0(new dc(m0Var2, 4));
                wVar.setOnDismissListener(new pb(m0Var2, i10));
                wVar.show();
                PhotoViewer photoViewer = ((pt0) m0Var2).d2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.B();
                    break;
                }
                break;
            case 2:
                m0 m0Var3 = this.b;
                j jVar = m0Var3.H0;
                if ((jVar instanceof w2) && !m0Var3.I0) {
                    w2 w2Var = (w2) jVar;
                    m0Var3.I0 = true;
                    w2Var.q();
                    View focusedView = w2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = m0Var3.G1;
                if (o1Var != null && o1Var.isShowing()) {
                    m0Var3.G1.d(true);
                    break;
                }
                break;
            case 3:
                m0.Z(this.b);
                break;
            default:
                m0 m0Var4 = this.b;
                m0Var4.A0(2);
                if (!(m0Var4.H0 instanceof w2)) {
                    m0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
