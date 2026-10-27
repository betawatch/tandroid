package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wn0 implements po0 {
    public final /* synthetic */ ro0 a;

    public wn0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.po0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ro0 ro0Var = this.a;
        ro0Var.I0 = tL_payments_validateRequestedInfo;
        ro0Var.C0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void a(TL_account.Password password) {
    }
}
