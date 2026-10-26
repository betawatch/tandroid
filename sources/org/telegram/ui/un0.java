package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class un0 implements no0 {
    public final /* synthetic */ po0 a;

    public un0(po0 po0Var) {
        this.a = po0Var;
    }

    @Override // org.telegram.ui.no0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.no0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        po0 po0Var = this.a;
        po0Var.I0 = tL_payments_validateRequestedInfo;
        po0Var.C0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.no0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.no0
    public final /* synthetic */ void a(TL_account.Password password) {
    }
}
