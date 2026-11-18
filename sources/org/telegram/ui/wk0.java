package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wk0 implements kl0 {
    public final /* synthetic */ ml0 a;

    public wk0(ml0 ml0Var) {
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
