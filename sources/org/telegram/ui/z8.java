package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z8 extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, p2Var, frameLayout, false, g6Var);
        this.K0 = i10;
        this.L0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                l9 l9Var = (l9) this.L0;
                l9Var.J.i(l9Var.K, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.L0;
                xiVar.x.i(xiVar.y, i10 == 0, true);
                break;
            default:
                mf1 mf1Var = (mf1) this.L0;
                mf1Var.R0.i(mf1Var.C0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(mf1 mf1Var, Context context, mf1 mf1Var2) {
        super(context, mf1Var2, null, false, null);
        this.K0 = 2;
        this.L0 = mf1Var;
    }
}
