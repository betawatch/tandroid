package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rl0(qm0 qm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        qm0 qm0Var = this.b;
        switch (i10) {
            case 0:
                qm0Var.e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qm0Var.a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.s4.w0(qm0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = qm0Var.C0;
                        if (paymentForm != null && qm0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            qm0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(qm0Var.a0);
                        qm0 qm0Var2 = qm0Var.f0;
                        if (qm0Var2 != null) {
                            qm0Var2.I0(qm0Var.a0);
                        }
                        if (!qm0Var.a0.has_password && qm0Var.d0 == null) {
                            pl0 pl0Var = new pl0(qm0Var, 2);
                            qm0Var.d0 = pl0Var;
                            org.telegram.messenger.i0.h3(pl0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                qm0.a0(qm0Var, tL_error, tLObject);
                break;
            default:
                qm0.c0(qm0Var, tL_error, tLObject);
                break;
        }
    }
}
