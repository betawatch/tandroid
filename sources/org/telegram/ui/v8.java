package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v8 extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, o2Var, frameLayout, false, c6Var);
        this.J0 = i10;
        this.K0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                h9 h9Var = (h9) this.K0;
                h9Var.I.i(h9Var.J, i10 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.K0;
                yiVar.x.i(yiVar.y, i10 == 0, true);
                break;
            default:
                ze1 ze1Var = (ze1) this.K0;
                ze1Var.Q0.i(ze1Var.B0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(ze1 ze1Var, Context context, ze1 ze1Var2) {
        super(context, ze1Var2, null, false, null);
        this.J0 = 2;
        this.K0 = ze1Var;
    }
}
