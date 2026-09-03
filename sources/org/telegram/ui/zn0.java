package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zn0 implements jo0 {
    public final /* synthetic */ lo0 a;

    public zn0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // org.telegram.ui.jo0
    public final void a(TL_account.Password password) {
        this.a.X = password;
    }

    @Override // org.telegram.ui.jo0
    public final void b() {
        this.a.c0 = null;
    }

    @Override // org.telegram.ui.jo0
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        lo0 lo0Var = this.a;
        jo0 jo0Var = lo0Var.Q;
        if (jo0Var != null) {
            jo0Var.c(str, str2, z4, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (lo0Var.P0) {
            lo0Var.removeSelfFromStack();
        }
        return lo0Var.Q != null;
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
