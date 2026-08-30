package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z8 extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, p2Var, frameLayout, false, f6Var);
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
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.L0;
                wiVar.x.i(wiVar.y, i10 == 0, true);
                break;
            default:
                kf1 kf1Var = (kf1) this.L0;
                kf1Var.R0.i(kf1Var.C0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(kf1 kf1Var, Context context, kf1 kf1Var2) {
        super(context, kf1Var2, null, false, null);
        this.K0 = 2;
        this.L0 = kf1Var;
    }
}
