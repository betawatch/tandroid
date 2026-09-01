package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yn0 implements jo0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ lo0 b;

    public yn0(lo0 lo0Var, Runnable runnable) {
        this.b = lo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.jo0
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        lo0 lo0Var = this.b;
        lo0Var.v0 = tL_paymentSavedCredentialsCard;
        lo0Var.t0 = str;
        lo0Var.R0 = z4;
        lo0Var.u0 = str2;
        lo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.z8[] z8VarArr = lo0Var.V;
        org.telegram.ui.Cells.z8 z8Var = z8VarArr[0];
        if (z8Var != null) {
            z8Var.setVisibility(0);
            org.telegram.ui.Cells.z8 z8Var2 = z8VarArr[0];
            String str4 = lo0Var.u0;
            if (str4 == null || str4.length() <= 1) {
                str3 = lo0Var.u0;
            } else {
                str3 = lo0Var.u0.substring(0, 1).toUpperCase() + lo0Var.u0.substring(1);
            }
            z8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.z8 z8Var3 = z8VarArr[1];
            if (z8Var3 != null) {
                z8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.jo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
