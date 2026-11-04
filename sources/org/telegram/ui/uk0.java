package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uk0 implements bl0 {
    public final /* synthetic */ dl0 a;

    public uk0(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @Override // org.telegram.ui.bl0
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // org.telegram.ui.bl0
    public final void b() {
        this.a.g0 = null;
    }

    @Override // org.telegram.ui.bl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        dl0 dl0Var = this.a;
        bl0 bl0Var = dl0Var.U;
        if (bl0Var != null) {
            bl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (dl0Var.T0) {
            dl0Var.removeSelfFromStack();
        }
        return dl0Var.U != null;
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
