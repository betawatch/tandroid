package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wd1 implements View.OnClickListener {
    public final /* synthetic */ re1 a;

    public wd1(re1 re1Var) {
        this.a = re1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        re1 re1Var = this.a;
        if (re1Var.M == 1) {
            org.telegram.ui.Components.f5.i0(re1Var, -re1Var.a, null, re1Var.g(), null, false, re1Var.J, new va(this, 5), re1Var.getResourceProvider());
            return;
        }
        re1Var.getMessagesController().addUserToChat(re1Var.a, re1Var.getUserConfig().getCurrentUser(), 0, null, re1Var, false, new pd1(re1Var, 2), new qd1(re1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        re1Var.O0(false);
    }
}
