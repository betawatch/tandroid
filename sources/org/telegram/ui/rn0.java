package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rn0(so0 so0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = so0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                so0 so0Var = this.b;
                so0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    so0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(so0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = so0Var.C0;
                        if (paymentForm != null && so0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            so0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(so0Var.a0);
                        so0 so0Var2 = so0Var.f0;
                        if (so0Var2 != null) {
                            so0Var2.C0(so0Var.a0);
                        }
                        if (!so0Var.a0.has_password && so0Var.d0 == null) {
                            pn0 pn0Var = new pn0(so0Var, 3);
                            so0Var.d0 = pn0Var;
                            AndroidUtilities.runOnUIThread(pn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                so0.T(this.b, this.c, this.d);
                break;
            default:
                so0.W(this.b, this.c, this.d);
                break;
        }
    }
}
