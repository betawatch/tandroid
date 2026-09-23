package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ wf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b.v;
                rg0Var.u1(0, true, null, true);
                rg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 1:
                rg0 rg0Var2 = this.b.v;
                rg0Var2.u1(0, true, null, true);
                rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.b.setLoading(false);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                rg0 rg0Var3 = this.b.v;
                i10 = ((org.telegram.ui.ActionBar.n2) rg0Var3).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i10);
                rg0Var3.presentFragment(premiumPreviewFragment);
                break;
        }
    }
}
