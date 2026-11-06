package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xk0 implements fl0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ hl0 b;

    public xk0(hl0 hl0Var, Runnable runnable) {
        this.b = hl0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.fl0
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        hl0 hl0Var = this.b;
        hl0Var.y0 = tL_paymentSavedCredentialsCard;
        hl0Var.w0 = str;
        hl0Var.U0 = z9;
        hl0Var.x0 = str2;
        hl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = hl0Var.Y;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = hl0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = hl0Var.x0;
            } else {
                str3 = hl0Var.x0.substring(0, 1).toUpperCase() + hl0Var.x0.substring(1);
            }
            y8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.hd.M0(2131747413, null), true);
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

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.fl0
    public final /* synthetic */ void b() {
    }
}
