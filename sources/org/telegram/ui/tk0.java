package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tk0 implements hl0 {
    public final /* synthetic */ jl0 a;

    public tk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.hl0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        jl0 jl0Var = this.a;
        jl0Var.I0 = tL_payments_validateRequestedInfo;
        jl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void b() {
    }
}
