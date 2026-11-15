package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rk0 implements hl0 {
    public final /* synthetic */ jl0 a;

    public rk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.hl0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        jl0 jl0Var = this.a;
        jl0Var.J0 = tL_payments_validateRequestedInfo;
        jl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void b() {
    }
}
