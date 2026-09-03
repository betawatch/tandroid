package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y30 extends v4 {
    public final /* synthetic */ e60 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = e60Var;
    }

    @Override // org.telegram.ui.v4, org.telegram.ui.Components.rh0
    public final void c() {
        e60 e60Var = this.R;
        AccountInstance accountInstance = e60Var.d;
        z30 z30Var = e60Var.b;
        long dialogId = z30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            z30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
