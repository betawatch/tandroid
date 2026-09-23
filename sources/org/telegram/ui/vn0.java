package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vn0 implements oo0 {
    public final /* synthetic */ qo0 a;

    public vn0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    @Override // org.telegram.ui.oo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.oo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        qo0 qo0Var = this.a;
        qo0Var.I0 = tL_payments_validateRequestedInfo;
        qo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.oo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.oo0
    public final /* synthetic */ void b() {
    }
}
