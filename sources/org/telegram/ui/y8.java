package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, p2Var, frameLayout, false, f6Var);
        this.N0 = i10;
        this.O0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.N0) {
            case 0:
                k9 k9Var = (k9) this.O0;
                k9Var.M.i(k9Var.N, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.jj jjVar = (org.telegram.ui.Components.jj) this.O0;
                jjVar.x.i(jjVar.y, i10 == 0, true);
                break;
            default:
                ig1 ig1Var = (ig1) this.O0;
                ig1Var.U0.i(ig1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(ig1 ig1Var, Context context, ig1 ig1Var2) {
        super(context, ig1Var2, null, false, null);
        this.N0 = 2;
        this.O0 = ig1Var;
    }
}
