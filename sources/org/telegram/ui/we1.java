package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            org.telegram.ui.Components.z4.j0(sf1Var, -sf1Var.a, null, sf1Var.g(), null, false, sf1Var.G, new va(this, 5), sf1Var.getResourceProvider());
            return;
        }
        sf1Var.getMessagesController().addUserToChat(sf1Var.a, sf1Var.getUserConfig().getCurrentUser(), 0, null, sf1Var, false, new pe1(sf1Var, 2), new qe1(sf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        sf1Var.O0(false);
    }
}
