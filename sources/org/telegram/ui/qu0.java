package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ru0 b;

    public /* synthetic */ qu0(ru0 ru0Var, int i10) {
        this.a = i10;
        this.b = ru0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.K = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(privacyControlActivity.i0, privacyControlActivity.c);
                privacyControlActivity.J0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                ru0 ru0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = ru0Var.d;
                TLRPC.UserFull a2 = privacyControlActivity2.getMessagesController().a2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(a2, false);
                }
                privacyControlActivity2.getMessagesController().l2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new tp0(ru0Var, a2, tL_birthday2, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.wp.r1(i10).h4(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.at.f(i11).k(org.telegram.messenger.at.g5, new Object[0]);
                privacyControlActivity2.K0(true);
                break;
        }
    }
}
