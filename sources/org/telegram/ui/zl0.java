package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zl0 implements om0 {
    public final /* synthetic */ qm0 a;

    public zl0(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.om0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        qm0 qm0Var = this.a;
        qm0Var.I0 = tL_payments_validateRequestedInfo;
        qm0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void b() {
    }
}
