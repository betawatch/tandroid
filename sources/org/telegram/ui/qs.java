package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qs extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ us a;

    public qs(us usVar) {
        this.a = usVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        us usVar = this.a;
        if (i10 == -1) {
            usVar.finishFragment();
            return;
        }
        if (i10 != 1 || usVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
        TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
        user.first_name = usVar.b.getText().toString();
        user.last_name = usVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = usVar.d.getTextWithEntities();
        usVar.getMessagesController().putUser(user, false);
        usVar.getContactsController().addContact(user, textWithEntities, usVar.K && usVar.X);
        i11 = ((org.telegram.ui.ActionBar.o2) usVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + usVar.H, 3).commit();
        usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(usVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) usVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            usVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        usVar.finishFragment();
        ts tsVar = usVar.O;
        if (tsVar != null) {
            tsVar.b();
        }
    }
}
