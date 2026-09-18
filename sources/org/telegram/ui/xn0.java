package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ xn0(yo0 yo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = yo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.b;
                yo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    yo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(yo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = yo0Var.C0;
                        if (paymentForm != null && yo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            yo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(yo0Var.a0);
                        yo0 yo0Var2 = yo0Var.f0;
                        if (yo0Var2 != null) {
                            yo0Var2.C0(yo0Var.a0);
                        }
                        if (!yo0Var.a0.has_password && yo0Var.d0 == null) {
                            vn0 vn0Var = new vn0(yo0Var, 3);
                            yo0Var.d0 = vn0Var;
                            AndroidUtilities.runOnUIThread(vn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                yo0.V(this.b, this.c, this.d);
                break;
            default:
                yo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
