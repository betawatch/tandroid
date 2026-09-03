package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf0 b;

    public /* synthetic */ vf0(yf0 yf0Var, int i10) {
        this.a = i10;
        this.b = yf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b.v;
                pg0Var.u1(0, true, null, true);
                pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                pg0 pg0Var2 = this.b.v;
                pg0Var2.u1(0, true, null, true);
                pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                pg0 pg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                pg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
