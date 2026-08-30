package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wn0 implements ho0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ jo0 b;

    public wn0(jo0 jo0Var, Runnable runnable) {
        this.b = jo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.ho0
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jo0 jo0Var = this.b;
        jo0Var.v0 = tL_paymentSavedCredentialsCard;
        jo0Var.t0 = str;
        jo0Var.R0 = z4;
        jo0Var.u0 = str2;
        jo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.z8[] z8VarArr = jo0Var.V;
        org.telegram.ui.Cells.z8 z8Var = z8VarArr[0];
        if (z8Var != null) {
            z8Var.setVisibility(0);
            org.telegram.ui.Cells.z8 z8Var2 = z8VarArr[0];
            String str4 = jo0Var.u0;
            if (str4 == null || str4.length() <= 1) {
                str3 = jo0Var.u0;
            } else {
                str3 = jo0Var.u0.substring(0, 1).toUpperCase() + jo0Var.u0.substring(1);
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

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.ho0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
