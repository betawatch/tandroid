package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y8 extends FragmentContextView {
    public final /* synthetic */ int N0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, n2Var, frameLayout, false, f6Var);
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
                org.telegram.ui.Components.gj gjVar = (org.telegram.ui.Components.gj) this.O0;
                gjVar.x.i(gjVar.y, i10 == 0, true);
                break;
            default:
                eg1 eg1Var = (eg1) this.O0;
                eg1Var.U0.i(eg1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(eg1 eg1Var, Context context, eg1 eg1Var2) {
        super(context, eg1Var2, null, false, null);
        this.N0 = 2;
        this.O0 = eg1Var;
    }
}
