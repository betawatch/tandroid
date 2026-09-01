package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x30 extends t4 {
    public final /* synthetic */ d60 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = d60Var;
    }

    @Override // org.telegram.ui.t4, org.telegram.ui.Components.sh0
    public final void c() {
        d60 d60Var = this.R;
        AccountInstance accountInstance = d60Var.d;
        y30 y30Var = d60Var.b;
        long dialogId = y30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            y30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
