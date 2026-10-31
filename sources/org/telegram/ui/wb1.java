package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ wb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new xb1(twoStepVerificationActivity, 2));
                break;
            case 2:
                this.b.o0();
                break;
            case 3:
                this.b.y0();
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
