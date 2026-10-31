package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ tl0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = sm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        sm0 sm0Var = this.b;
        switch (i10) {
            case 0:
                sm0Var.e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    sm0Var.a0 = password;
                    if (!TwoStepVerificationActivity.m0(password, false)) {
                        org.telegram.ui.Components.s4.w0(sm0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = sm0Var.C0;
                        if (paymentForm != null && sm0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            sm0Var.P0();
                        }
                        TwoStepVerificationActivity.q0(sm0Var.a0);
                        sm0 sm0Var2 = sm0Var.f0;
                        if (sm0Var2 != null) {
                            sm0Var2.H0(sm0Var.a0);
                        }
                        if (!sm0Var.a0.has_password && sm0Var.d0 == null) {
                            rl0 rl0Var = new rl0(sm0Var, 2);
                            sm0Var.d0 = rl0Var;
                            org.telegram.messenger.i0.h3(rl0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                sm0.Z(sm0Var, tL_error, tLObject);
                break;
            default:
                sm0.b0(sm0Var, tL_error, tLObject);
                break;
        }
    }
}
