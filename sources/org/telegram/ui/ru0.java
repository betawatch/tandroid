package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ su0 b;

    public /* synthetic */ ru0(su0 su0Var, int i10) {
        this.a = i10;
        this.b = su0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.K = ((Integer) obj).intValue();
                org.telegram.messenger.i0.Z3(privacyControlActivity.i0, privacyControlActivity.c);
                privacyControlActivity.I0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                su0 su0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = su0Var.d;
                TLRPC.UserFull a2 = privacyControlActivity2.getMessagesController().a2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(a2, false);
                }
                privacyControlActivity2.getMessagesController().l2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new vp0(su0Var, a2, tL_birthday2, 1), 1024);
                i10 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.vp.r1(i10).h4(0L, "BIRTHDAY_SETUP");
                i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.zs.f(i11).k(org.telegram.messenger.zs.g5, new Object[0]);
                privacyControlActivity2.J0(true);
                break;
        }
    }
}
