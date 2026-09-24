package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class w30 extends q4 {
    public final /* synthetic */ d60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = d60Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.uh0
    public final void c() {
        d60 d60Var = this.U;
        AccountInstance accountInstance = d60Var.d;
        x30 x30Var = d60Var.b;
        long dialogId = x30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            x30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
