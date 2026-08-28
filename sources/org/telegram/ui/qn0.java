package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qn0 implements ao0 {
    public final /* synthetic */ co0 a;

    public qn0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // org.telegram.ui.ao0
    public final void a(TL_account.Password password) {
        this.a.W = password;
    }

    @Override // org.telegram.ui.ao0
    public final void b() {
        this.a.b0 = null;
    }

    @Override // org.telegram.ui.ao0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        co0 co0Var = this.a;
        ao0 ao0Var = co0Var.P;
        if (ao0Var != null) {
            ao0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (co0Var.O0) {
            co0Var.removeSelfFromStack();
        }
        return co0Var.P != null;
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
