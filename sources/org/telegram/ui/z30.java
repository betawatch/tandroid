package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z30 extends q4 {
    public final /* synthetic */ g60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = g60Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.oi0
    public final void c() {
        g60 g60Var = this.U;
        AccountInstance accountInstance = g60Var.d;
        a40 a40Var = g60Var.b;
        long dialogId = a40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            a40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
