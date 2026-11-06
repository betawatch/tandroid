package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yk0 implements fl0 {
    public final /* synthetic */ hl0 a;

    public yk0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // org.telegram.ui.fl0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.fl0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.fl0
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        hl0 hl0Var = this.a;
        fl0 fl0Var = hl0Var.T;
        if (fl0Var != null) {
            fl0Var.c(str, str2, z9, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (hl0Var.S0) {
            hl0Var.removeSelfFromStack();
        }
        return hl0Var.T != null;
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
