package yf;

import android.view.View;
import gh.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ k(l0 l0Var, int i9) {
        this.a = i9;
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
                int i9 = l0Var2.c1;
                l0Var2.B0(1);
                l0Var2.postDelayed(new n(l0Var2, 1), 350L);
                v vVar = new v(l0Var2.getContext(), l0Var2.M1, false, false);
                vVar.y = new q(l0Var2);
                vVar.p0(new dg.o(l0Var2, 5));
                vVar.setOnDismissListener(new y8(l0Var2, i9));
                vVar.show();
                PhotoViewer photoViewer = ((xs0) l0Var2).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.t0();
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
                org.telegram.ui.ActionBar.o1 o1Var = l0Var3.N1;
                if (o1Var != null && o1Var.isShowing()) {
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
