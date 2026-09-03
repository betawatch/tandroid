package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class we1 implements View.OnClickListener {
    public final /* synthetic */ sf1 a;

    public we1(sf1 sf1Var) {
        this.a = sf1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sf1 sf1Var = this.a;
        if (sf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(sf1Var, -sf1Var.a, null, sf1Var.g(), null, false, sf1Var.G, new ta(this, 5), sf1Var.getResourceProvider());
            return;
        }
        sf1Var.getMessagesController().addUserToChat(sf1Var.a, sf1Var.getUserConfig().getCurrentUser(), 0, null, sf1Var, false, new qe1(sf1Var, 2), new re1(sf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        sf1Var.O0(false);
    }
}
