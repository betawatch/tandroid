package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class un0 implements eo0 {
    public final /* synthetic */ go0 a;

    public un0(go0 go0Var) {
        this.a = go0Var;
    }

    @Override // org.telegram.ui.eo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.eo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.eo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        go0 go0Var = this.a;
        eo0 eo0Var = go0Var.T;
        if (eo0Var != null) {
            eo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (go0Var.S0) {
            go0Var.removeSelfFromStack();
        }
        return go0Var.T != null;
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
