package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.P0 = i10;
        this.Q0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                k9 k9Var = (k9) this.Q0;
                k9Var.M.i(k9Var.N, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.Q0;
                gjVar.x.i(gjVar.y, i10 == 0, true);
                break;
            default:
                eg1 eg1Var = (eg1) this.Q0;
                eg1Var.U0.i(eg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(eg1 eg1Var, Context context, eg1 eg1Var2) {
        super(context, eg1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = eg1Var;
    }
}
