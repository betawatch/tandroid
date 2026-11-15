package tg;

import android.view.View;
import di.qa;
import di.z9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ k(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                if (!g0Var.D0) {
                    g0Var.B0(0);
                    break;
                } else {
                    g0Var.r0(null, true);
                    break;
                }
            case 1:
                g0 g0Var2 = this.b;
                int i7 = g0Var2.Q0;
                g0Var2.B0(1);
                g0Var2.postDelayed(new n(g0Var2, 1), 350L);
                v vVar = new v(g0Var2.getContext(), g0Var2.A1, false, false);
                vVar.z1 = new q(g0Var2);
                vVar.N0(new qa(g0Var2, 4));
                vVar.setOnDismissListener(new z9(g0Var2, i7));
                vVar.show();
                g0Var2.o0(true);
                break;
            case 2:
                g0 g0Var3 = this.b;
                j jVar = g0Var3.C0;
                if ((jVar instanceof o2) && !g0Var3.D0) {
                    o2 o2Var = (o2) jVar;
                    g0Var3.D0 = true;
                    o2Var.q();
                    View focusedView = o2Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.g0.J3(focusedView);
                }
                org.telegram.ui.ActionBar.g1 g1Var = g0Var3.B1;
                if (g1Var != null && g1Var.isShowing()) {
                    g0Var3.B1.d(true);
                    break;
                }
                break;
            case 3:
                g0.Z(this.b);
                break;
            default:
                g0 g0Var4 = this.b;
                g0Var4.B0(2);
                if (!(g0Var4.C0 instanceof o2)) {
                    g0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
