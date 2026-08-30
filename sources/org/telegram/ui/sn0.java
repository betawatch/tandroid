package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sn0 implements ho0 {
    public final /* synthetic */ jo0 a;

    public sn0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.ho0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        jo0 jo0Var = this.a;
        jo0Var.F0 = tL_payments_validateRequestedInfo;
        jo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void b() {
    }
}
