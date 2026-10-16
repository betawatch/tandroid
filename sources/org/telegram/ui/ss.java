package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ss extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ws a;

    public ss(ws wsVar) {
        this.a = wsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ws wsVar = this.a;
        if (i10 == -1) {
            wsVar.finishFragment();
            return;
        }
        if (i10 != 1 || wsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
        TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
        user.first_name = wsVar.b.getText().toString();
        user.last_name = wsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = wsVar.d.getTextWithEntities();
        wsVar.getMessagesController().putUser(user, false);
        wsVar.getContactsController().addContact(user, textWithEntities, wsVar.K && wsVar.X);
        i11 = ((org.telegram.ui.ActionBar.m2) wsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + wsVar.H, 3).commit();
        wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(wsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.m2) wsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            wsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        wsVar.finishFragment();
        vs vsVar = wsVar.O;
        if (vsVar != null) {
            vsVar.b();
        }
    }
}
