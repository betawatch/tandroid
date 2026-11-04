package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ zs0(at0 at0Var, int i3) {
        this.a = i3;
        this.b = at0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        int i10;
        switch (this.a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.b.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                org.telegram.messenger.g0.a4(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.P0();
                break;
            default:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                at0 at0Var = this.b;
                PrivacyControlActivity privacyControlActivity2 = at0Var.d;
                TLRPC.UserFull b22 = privacyControlActivity2.getMessagesController().b2(privacyControlActivity2.getUserConfig().e());
                TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
                if (b22 != null) {
                    b22.flags2 |= 32;
                    b22.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().j2(b22, false);
                }
                privacyControlActivity2.getMessagesController().m2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new co0(at0Var, b22, tL_birthday2, 1), 1024);
                i3 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.hp.s1(i3).k4(0L, "BIRTHDAY_SETUP");
                i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity2).currentAccount;
                org.telegram.messenger.hs.f(i10).k(org.telegram.messenger.hs.g5, new Object[0]);
                privacyControlActivity2.Q0(true);
                break;
        }
    }
}
