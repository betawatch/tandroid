package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ sw0(uw0 uw0Var, int i9) {
        this.a = i9;
        this.b = uw0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.H = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(privacyControlActivity.d, privacyControlActivity.f0);
                privacyControlActivity.D0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                uw0 uw0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                TLRPC.UserFull userFull = privacyControlActivity2.getMessagesController().getUserFull(privacyControlActivity2.getUserConfig().getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                privacyControlActivity2.getMessagesController().invalidateContentSettings();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new kr0(uw0Var, userFull, tL_birthday2, 1), 1024);
                i9 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).currentAccount;
                MessagesController.getInstance(i9).removeSuggestion(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity2).currentAccount;
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.E0(true);
                break;
        }
    }
}
