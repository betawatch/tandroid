package tg;

import android.view.View;
import di.ca;
import di.ta;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ k(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                if (!h0Var.D0) {
                    h0Var.B0(0);
                    break;
                } else {
                    h0Var.r0(null, true);
                    break;
                }
            case 1:
                h0 h0Var2 = this.b;
                int i7 = h0Var2.Q0;
                h0Var2.B0(1);
                h0Var2.postDelayed(new n(h0Var2, 1), 350L);
                w wVar = new w(h0Var2.getContext(), h0Var2.A1, false, false);
                wVar.z1 = new q(h0Var2);
                wVar.O0(new ta(h0Var2, 4));
                wVar.setOnDismissListener(new ca(h0Var2, i7));
                wVar.show();
                h0Var2.o0(true);
                break;
            case 2:
                h0 h0Var3 = this.b;
                j jVar = h0Var3.C0;
                if ((jVar instanceof n2) && !h0Var3.D0) {
                    n2 n2Var = (n2) jVar;
                    h0Var3.D0 = true;
                    n2Var.q();
                    View focusedView = n2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.I3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = h0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    h0Var3.B1.d(true);
                    break;
                }
                break;
            case 3:
                h0.Z(this.b);
                break;
            default:
                h0 h0Var4 = this.b;
                h0Var4.B0(2);
                if (!(h0Var4.C0 instanceof n2)) {
                    h0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
