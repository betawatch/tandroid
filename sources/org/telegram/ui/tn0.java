package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class tn0 implements do0 {
    public final /* synthetic */ fo0 a;

    public tn0(fo0 fo0Var) {
        this.a = fo0Var;
    }

    @Override // org.telegram.ui.do0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.do0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.do0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        fo0 fo0Var = this.a;
        do0 do0Var = fo0Var.T;
        if (do0Var != null) {
            do0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (fo0Var.S0) {
            fo0Var.removeSelfFromStack();
        }
        return fo0Var.T != null;
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
