package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z8 extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.P0 = i10;
        this.Q0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                l9 l9Var = (l9) this.Q0;
                l9Var.M.i(l9Var.N, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.Q0;
                gjVar.x.i(gjVar.y, i10 == 0, true);
                break;
            default:
                dg1 dg1Var = (dg1) this.Q0;
                dg1Var.U0.i(dg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(dg1 dg1Var, Context context, dg1 dg1Var2) {
        super(context, dg1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = dg1Var;
    }
}
