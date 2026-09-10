package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay0 b;

    public /* synthetic */ yx0(ay0 ay0Var, int i10) {
        this.a = i10;
        this.b = ay0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.L = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(privacyControlActivity.d, privacyControlActivity.j0);
                privacyControlActivity.E0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                ay0 ay0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = ay0Var.d;
                TLRPC.UserFull userFull = privacyControlActivity2.getMessagesController().getUserFull(privacyControlActivity2.getUserConfig().getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                }
                privacyControlActivity2.getMessagesController().invalidateContentSettings();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new ms0(ay0Var, userFull, tL_birthday2, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).currentAccount;
                MessagesController.getInstance(i10).removeSuggestion(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity2).currentAccount;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                privacyControlActivity2.F0(true);
                break;
        }
    }
}
