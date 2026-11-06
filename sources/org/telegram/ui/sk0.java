package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sk0 implements fl0 {
    public final /* synthetic */ hl0 a;

    public sk0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.fl0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        hl0 hl0Var = this.a;
        hl0Var.I0 = tL_payments_validateRequestedInfo;
        hl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void b() {
    }
}
