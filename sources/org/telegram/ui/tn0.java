package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tn0 implements jo0 {
    public final /* synthetic */ lo0 a;

    public tn0(lo0 lo0Var) {
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
