package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zk0 implements hl0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ jl0 b;

    public zk0(jl0 jl0Var, Runnable runnable) {
        this.b = jl0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.hl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jl0 jl0Var = this.b;
        jl0Var.z0 = tL_paymentSavedCredentialsCard;
        jl0Var.x0 = str;
        jl0Var.V0 = z10;
        jl0Var.y0 = str2;
        jl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.x8[] x8VarArr = jl0Var.Z;
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            x8Var.setVisibility(0);
            org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[0];
            String str4 = jl0Var.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = jl0Var.y0;
            } else {
                str3 = jl0Var.y0.substring(0, 1).toUpperCase() + jl0Var.y0.substring(1);
            }
            x8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.hd.M0(2131747414, null), true);
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[1];
            if (x8Var3 != null) {
                x8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void b() {
    }
}
