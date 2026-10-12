package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qo0 implements ap0 {
    public final /* synthetic */ cp0 a;

    public qo0(cp0 cp0Var) {
        this.a = cp0Var;
    }

    @Override // org.telegram.ui.ap0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.ap0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.ap0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        cp0 cp0Var = this.a;
        ap0 ap0Var = cp0Var.T;
        if (ap0Var != null) {
            ap0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (cp0Var.S0) {
            cp0Var.removeSelfFromStack();
        }
        return cp0Var.T != null;
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
