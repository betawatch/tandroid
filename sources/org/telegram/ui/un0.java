package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class un0 implements mo0 {
    public final /* synthetic */ oo0 a;

    public un0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.mo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        oo0 oo0Var = this.a;
        oo0Var.I0 = tL_payments_validateRequestedInfo;
        oo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void b() {
    }
}
