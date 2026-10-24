package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
