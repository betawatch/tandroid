package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ qk0(ml0 ml0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = ml0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        ml0 ml0Var = this.b;
        switch (i7) {
            case 0:
                ml0Var.f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ml0Var.b0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.c5.u0(ml0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743577, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = ml0Var.D0;
                        if (paymentForm != null && ml0Var.b0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            ml0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(ml0Var.b0);
                        ml0 ml0Var2 = ml0Var.g0;
                        if (ml0Var2 != null) {
                            ml0Var2.I0(ml0Var.b0);
                        }
                        if (!ml0Var.b0.has_password && ml0Var.e0 == null) {
                            nk0 nk0Var = new nk0(ml0Var, 2);
                            ml0Var.e0 = nk0Var;
                            org.telegram.messenger.g0.h3(nk0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ml0.a0(ml0Var, tL_error, tLObject);
                break;
            default:
                ml0.c0(ml0Var, tL_error, tLObject);
                break;
        }
    }
}
