package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ vf0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b.v;
                qg0Var.u1(0, true, null, true);
                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                qg0 qg0Var2 = this.b.v;
                qg0Var2.u1(0, true, null, true);
                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                qg0 qg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.m2) qg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                qg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
