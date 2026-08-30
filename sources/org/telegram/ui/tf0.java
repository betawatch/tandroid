package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf0 b;

    public /* synthetic */ tf0(wf0 wf0Var, int i10) {
        this.a = i10;
        this.b = wf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ng0 ng0Var = this.b.v;
                ng0Var.u1(0, true, null, true);
                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                ng0 ng0Var2 = this.b.v;
                ng0Var2.u1(0, true, null, true);
                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                ng0 ng0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) ng0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                ng0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
