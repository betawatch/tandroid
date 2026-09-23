package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, n2Var, frameLayout, false, d6Var);
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
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) this.Q0;
                hjVar.x.i(hjVar.y, i10 == 0, true);
                break;
            default:
                wf1 wf1Var = (wf1) this.Q0;
                wf1Var.U0.i(wf1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.P0 = 2;
        this.Q0 = wf1Var;
    }
}
