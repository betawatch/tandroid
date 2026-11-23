package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class uk0 implements kl0 {
    public final /* synthetic */ ml0 a;

    public uk0(ml0 ml0Var) {
        this.a = ml0Var;
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.kl0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ml0 ml0Var = this.a;
        ml0Var.J0 = tL_payments_validateRequestedInfo;
        ml0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void b() {
    }
}
