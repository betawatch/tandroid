package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sn0 implements jo0 {
    public final /* synthetic */ lo0 a;

    public sn0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.jo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        lo0 lo0Var = this.a;
        lo0Var.F0 = tL_payments_validateRequestedInfo;
        lo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void b() {
    }
}
