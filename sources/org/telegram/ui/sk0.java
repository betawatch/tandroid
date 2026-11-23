package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sk0 implements il0 {
    public final /* synthetic */ kl0 a;

    public sk0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.il0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        kl0 kl0Var = this.a;
        kl0Var.J0 = tL_payments_validateRequestedInfo;
        kl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void b() {
    }
}
