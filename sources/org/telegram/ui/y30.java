package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y30 extends r4 {
    public final /* synthetic */ f60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = f60Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.kh0
    public final void c() {
        f60 f60Var = this.U;
        AccountInstance accountInstance = f60Var.d;
        z30 z30Var = f60Var.b;
        long dialogId = z30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            z30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
