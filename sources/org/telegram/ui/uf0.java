package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ uf0(xf0 xf0Var, int i10) {
        this.a = i10;
        this.b = xf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                og0 og0Var = this.b.v;
                og0Var.u1(0, true, null, true);
                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                og0 og0Var2 = this.b.v;
                og0Var2.u1(0, true, null, true);
                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                og0 og0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.p2) og0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                og0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
