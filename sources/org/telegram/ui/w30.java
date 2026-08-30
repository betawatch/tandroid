package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w30 extends t4 {
    public final /* synthetic */ c60 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = c60Var;
    }

    @Override // org.telegram.ui.t4, org.telegram.ui.Components.qh0
    public final void c() {
        c60 c60Var = this.R;
        AccountInstance accountInstance = c60Var.d;
        x30 x30Var = c60Var.b;
        long dialogId = x30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            x30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
