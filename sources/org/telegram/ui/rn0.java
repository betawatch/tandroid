package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rn0 implements bo0 {
    public final /* synthetic */ do0 a;

    public rn0(do0 do0Var) {
        this.a = do0Var;
    }

    @Override // org.telegram.ui.bo0
    public final void a(TL_account.Password password) {
        this.a.W = password;
    }

    @Override // org.telegram.ui.bo0
    public final void b() {
        this.a.b0 = null;
    }

    @Override // org.telegram.ui.bo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        do0 do0Var = this.a;
        bo0 bo0Var = do0Var.P;
        if (bo0Var != null) {
            bo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (do0Var.O0) {
            do0Var.removeSelfFromStack();
        }
        return do0Var.P != null;
    }

    @Override // org.telegram.ui.bo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
