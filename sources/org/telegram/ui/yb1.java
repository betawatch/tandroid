package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ yb1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(twoStepVerificationActivity.s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                yb1 yb1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.i0.r(yb1Var);
                org.telegram.messenger.i0.h3(yb1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                break;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.w.a(0.0f);
                break;
            default:
                this.b.C0();
                break;
        }
    }
}
