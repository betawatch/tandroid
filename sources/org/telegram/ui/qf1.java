package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qf1 implements View.OnClickListener {
    public final /* synthetic */ lg1 a;

    public qf1(lg1 lg1Var) {
        this.a = lg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lg1 lg1Var = this.a;
        if (lg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(lg1Var, -lg1Var.a, null, lg1Var.g(), null, false, lg1Var.J, new za(this, 5), lg1Var.getResourceProvider());
            return;
        }
        lg1Var.getMessagesController().addUserToChat(lg1Var.a, lg1Var.getUserConfig().getCurrentUser(), 0, null, lg1Var, false, new jf1(lg1Var, 2), new kf1(lg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        lg1Var.O0(false);
    }
}
