package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xn0 implements ho0 {
    public final /* synthetic */ jo0 a;

    public xn0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // org.telegram.ui.ho0
    public final void a(TL_account.Password password) {
        this.a.X = password;
    }

    @Override // org.telegram.ui.ho0
    public final void b() {
        this.a.c0 = null;
    }

    @Override // org.telegram.ui.ho0
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jo0 jo0Var = this.a;
        ho0 ho0Var = jo0Var.Q;
        if (ho0Var != null) {
            ho0Var.c(str, str2, z4, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jo0Var.P0) {
            jo0Var.removeSelfFromStack();
        }
        return jo0Var.Q != null;
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
