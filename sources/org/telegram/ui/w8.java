package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w8 extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, o2Var, frameLayout, false, b6Var);
        this.J0 = i9;
        this.K0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i9) {
        switch (this.J0) {
            case 0:
                i9 i9Var = (i9) this.K0;
                i9Var.I.i(i9Var.J, i9 == 0, true);
                break;
            case 1:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.K0;
                viVar.x.i(viVar.y, i9 == 0, true);
                break;
            default:
                we1 we1Var = (we1) this.K0;
                we1Var.Q0.i(we1Var.B0, i9 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(we1 we1Var, Context context, we1 we1Var2) {
        super(context, we1Var2, null, false, null);
        this.J0 = 2;
        this.K0 = we1Var;
    }
}
