package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wn0 implements mo0 {
    public final /* synthetic */ oo0 a;

    public wn0(oo0 oo0Var) {
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
