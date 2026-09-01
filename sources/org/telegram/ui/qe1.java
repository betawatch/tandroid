package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qe1 implements View.OnClickListener {
    public final /* synthetic */ mf1 a;

    public qe1(mf1 mf1Var) {
        this.a = mf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf1 mf1Var = this.a;
        if (mf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(mf1Var, -mf1Var.a, null, mf1Var.g(), null, false, mf1Var.G, new ta(this, 5), mf1Var.getResourceProvider());
            return;
        }
        mf1Var.getMessagesController().addUserToChat(mf1Var.a, mf1Var.getUserConfig().getCurrentUser(), 0, null, mf1Var, false, new ke1(mf1Var, 2), new le1(mf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        mf1Var.O0(false);
    }
}
