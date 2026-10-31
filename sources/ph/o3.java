package ph;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.j20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.p10;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o3 extends p51 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(KeyEvent.Callback callback, tk0 tk0Var, Context context, int i10, j20 j20Var, p6 p6Var, int i11) {
        super(tk0Var, context, i10, 0, false, j20Var, p6Var);
        this.P = i11;
        this.Q = callback;
    }

    @Override // org.telegram.ui.Components.p51, s4.g0
    public void t(s4.c1 c1Var, int i10) {
        th.c0 c0Var;
        th.h0 h0Var;
        switch (this.P) {
            case 2:
                super.t(c1Var, i10);
                th.p1 p1Var = (th.p1) this.Q;
                if (p1Var.D) {
                    View view = c1Var.a;
                    if ((view instanceof th.c0) && (h0Var = (c0Var = (th.c0) view).K) != null && h0Var.a == p1Var.y) {
                        c0Var.c();
                        p1Var.D = false;
                        break;
                    }
                }
                break;
            default:
                super.t(c1Var, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p51, s4.g0
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        p6 p6Var;
        p6 p6Var2;
        p6 p6Var3;
        p6 p6Var4;
        switch (this.P) {
            case 0:
                q3 q3Var = (q3) this.Q;
                if (i10 != 0) {
                    if (i10 != 42) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 1:
                h8 h8Var = (h8) this.Q;
                if (i10 != 42) {
                    break;
                } else {
                    Activity parentActivity = h8Var.getParentActivity();
                    int i11 = t6.L6;
                    p6Var = ((org.telegram.ui.ActionBar.k2) h8Var).resourceProvider;
                    p4 p4Var = new p4(parentActivity, i11, 21, 0, false, p6Var);
                    p4Var.setHeight(25);
                    break;
                }
            case 3:
                wh.g gVar = (wh.g) this.Q;
                if (i10 != 42) {
                    break;
                } else {
                    Activity parentActivity2 = gVar.getParentActivity();
                    int i12 = t6.L6;
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) gVar).resourceProvider;
                    p4 p4Var2 = new p4(parentActivity2, i12, 21, 0, false, p6Var2);
                    p4Var2.setHeight(25);
                    break;
                }
            case 4:
                xh.i iVar = (xh.i) this.Q;
                if (i10 != 42) {
                    break;
                } else {
                    Activity parentActivity3 = iVar.getParentActivity();
                    int i13 = t6.L6;
                    p6Var3 = ((org.telegram.ui.ActionBar.k2) iVar).resourceProvider;
                    p4 p4Var3 = new p4(parentActivity3, i13, 21, 0, false, p6Var3);
                    p4Var3.setHeight(25);
                    break;
                }
            case 5:
                xh.z2 z2Var = (xh.z2) this.Q;
                if (i10 != 42) {
                    break;
                } else {
                    Activity parentActivity4 = z2Var.getParentActivity();
                    int i14 = t6.L6;
                    p6Var4 = ((org.telegram.ui.ActionBar.k2) z2Var).resourceProvider;
                    p4 p4Var4 = new p4(parentActivity4, i14, 21, 0, false, p6Var4);
                    p4Var4.setHeight(25);
                    break;
                }
        }
        return super.w(viewGroup, i10);
    }

    @Override // org.telegram.ui.Components.p51, s4.g0
    public void y(s4.c1 c1Var) {
        th.c0 c0Var;
        th.h0 h0Var;
        switch (this.P) {
            case 2:
                super.y(c1Var);
                th.p1 p1Var = (th.p1) this.Q;
                if (p1Var.D) {
                    View view = c1Var.a;
                    if ((view instanceof th.c0) && (h0Var = (c0Var = (th.c0) view).K) != null && h0Var.a == p1Var.y) {
                        c0Var.c();
                        p1Var.D = false;
                        break;
                    }
                }
                break;
            default:
                super.y(c1Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(p10 p10Var, tk0 tk0Var, Activity activity, int i10, int i11, j20 j20Var, p6 p6Var, int i12) {
        super(tk0Var, activity, i10, i11, true, j20Var, p6Var);
        this.P = i12;
        this.Q = p10Var;
    }
}
