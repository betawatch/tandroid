package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class sn0 implements eo0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ go0 b;

    public sn0(go0 go0Var, Runnable runnable) {
        this.b = go0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.eo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        go0 go0Var = this.b;
        go0Var.y0 = tL_paymentSavedCredentialsCard;
        go0Var.w0 = str;
        go0Var.U0 = z10;
        go0Var.x0 = str2;
        go0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.c9[] c9VarArr = go0Var.Y;
        org.telegram.ui.Cells.c9 c9Var = c9VarArr[0];
        if (c9Var != null) {
            c9Var.setVisibility(0);
            org.telegram.ui.Cells.c9 c9Var2 = c9VarArr[0];
            String str4 = go0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = go0Var.x0;
            } else {
                str3 = go0Var.x0.substring(0, 1).toUpperCase() + go0Var.x0.substring(1);
            }
            c9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.c9 c9Var3 = c9VarArr[1];
            if (c9Var3 != null) {
                c9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
