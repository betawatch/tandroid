package zf;

import android.view.View;
import hh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ k(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                if (!l0Var.P0) {
                    l0Var.B0(0);
                    break;
                } else {
                    l0Var.r0(null, true);
                    break;
                }
            case 1:
                l0 l0Var2 = this.b;
                int i10 = l0Var2.c1;
                l0Var2.B0(1);
                l0Var2.postDelayed(new n(l0Var2, 1), 350L);
                v vVar = new v(l0Var2.getContext(), l0Var2.M1, false, false);
                vVar.y = new q(l0Var2);
                vVar.q0(new eg.o(l0Var2, 5));
                vVar.setOnDismissListener(new x8(l0Var2, i10));
                vVar.show();
                PhotoViewer photoViewer = ((ys0) l0Var2).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.C();
                    break;
                }
                break;
            case 2:
                l0 l0Var3 = this.b;
                j jVar = l0Var3.O0;
                if ((jVar instanceof v2) && !l0Var3.P0) {
                    v2 v2Var = (v2) jVar;
                    l0Var3.P0 = true;
                    v2Var.q();
                    View focusedView = v2Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.n1 n1Var = l0Var3.N1;
                if (n1Var != null && n1Var.isShowing()) {
                    l0Var3.N1.d(true);
                    break;
                }
                break;
            case 3:
                l0.b0(this.b);
                break;
            default:
                l0 l0Var4 = this.b;
                l0Var4.B0(2);
                if (!(l0Var4.O0 instanceof v2)) {
                    l0Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
