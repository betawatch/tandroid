package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class rn0 implements do0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ fo0 b;

    public rn0(fo0 fo0Var, Runnable runnable) {
        this.b = fo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.do0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        fo0 fo0Var = this.b;
        fo0Var.y0 = tL_paymentSavedCredentialsCard;
        fo0Var.w0 = str;
        fo0Var.U0 = z10;
        fo0Var.x0 = str2;
        fo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.c9[] c9VarArr = fo0Var.Y;
        org.telegram.ui.Cells.c9 c9Var = c9VarArr[0];
        if (c9Var != null) {
            c9Var.setVisibility(0);
            org.telegram.ui.Cells.c9 c9Var2 = c9VarArr[0];
            String str4 = fo0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = fo0Var.x0;
            } else {
                str3 = fo0Var.x0.substring(0, 1).toUpperCase() + fo0Var.x0.substring(1);
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

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
