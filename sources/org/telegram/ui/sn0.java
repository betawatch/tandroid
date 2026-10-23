package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class sn0 implements co0 {
    public final /* synthetic */ eo0 a;

    public sn0(eo0 eo0Var) {
        this.a = eo0Var;
    }

    @Override // org.telegram.ui.co0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.co0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.co0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        eo0 eo0Var = this.a;
        co0 co0Var = eo0Var.T;
        if (co0Var != null) {
            co0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (eo0Var.S0) {
            eo0Var.removeSelfFromStack();
        }
        return eo0Var.T != null;
    }

    @Override // org.telegram.ui.co0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
