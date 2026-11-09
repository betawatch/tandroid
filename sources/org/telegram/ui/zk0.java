package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zk0 implements hl0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ jl0 b;

    public zk0(jl0 jl0Var, Runnable runnable) {
        this.b = jl0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.hl0
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jl0 jl0Var = this.b;
        jl0Var.y0 = tL_paymentSavedCredentialsCard;
        jl0Var.w0 = str;
        jl0Var.U0 = z9;
        jl0Var.x0 = str2;
        jl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = jl0Var.Y;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = jl0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = jl0Var.x0;
            } else {
                str3 = jl0Var.x0.substring(0, 1).toUpperCase() + jl0Var.x0.substring(1);
            }
            y8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.id.M0(2131747414, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
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
