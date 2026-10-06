package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class yn0 implements qo0 {
    public final /* synthetic */ so0 a;

    public yn0(so0 so0Var) {
        this.a = so0Var;
    }

    @Override // org.telegram.ui.qo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.qo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        so0 so0Var = this.a;
        so0Var.I0 = tL_payments_validateRequestedInfo;
        so0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.qo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.qo0
    public final /* synthetic */ void b() {
    }
}
