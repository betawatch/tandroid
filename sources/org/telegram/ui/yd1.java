package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yd1 implements View.OnClickListener {
    public final /* synthetic */ te1 a;

    public yd1(te1 te1Var) {
        this.a = te1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        te1 te1Var = this.a;
        if (te1Var.M == 1) {
            org.telegram.ui.Components.f5.i0(te1Var, -te1Var.a, null, te1Var.g(), null, false, te1Var.J, new xa(this, 5), te1Var.getResourceProvider());
            return;
        }
        te1Var.getMessagesController().addUserToChat(te1Var.a, te1Var.getUserConfig().getCurrentUser(), 0, null, te1Var, false, new rd1(te1Var, 2), new sd1(te1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        te1Var.O0(false);
    }
}
