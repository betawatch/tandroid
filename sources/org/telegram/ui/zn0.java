package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ zn0(ap0 ap0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ap0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.b;
                ap0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ap0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ap0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = ap0Var.C0;
                        if (paymentForm != null && ap0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            ap0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(ap0Var.a0);
                        ap0 ap0Var2 = ap0Var.f0;
                        if (ap0Var2 != null) {
                            ap0Var2.C0(ap0Var.a0);
                        }
                        if (!ap0Var.a0.has_password && ap0Var.d0 == null) {
                            xn0 xn0Var = new xn0(ap0Var, 3);
                            ap0Var.d0 = xn0Var;
                            AndroidUtilities.runOnUIThread(xn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ap0.V(this.b, this.c, this.d);
                break;
            default:
                ap0.X(this.b, this.c, this.d);
                break;
        }
    }
}
