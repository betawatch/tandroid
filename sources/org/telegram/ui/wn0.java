package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class wn0 implements go0 {
    public final /* synthetic */ io0 a;

    public wn0(io0 io0Var) {
        this.a = io0Var;
    }

    @Override // org.telegram.ui.go0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.go0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.go0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        io0 io0Var = this.a;
        go0 go0Var = io0Var.T;
        if (go0Var != null) {
            go0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (io0Var.S0) {
            io0Var.removeSelfFromStack();
        }
        return io0Var.T != null;
    }

    @Override // org.telegram.ui.go0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
