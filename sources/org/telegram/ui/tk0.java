package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tk0 implements bl0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ dl0 b;

    public tk0(dl0 dl0Var, Runnable runnable) {
        this.b = dl0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.bl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        dl0 dl0Var = this.b;
        dl0Var.z0 = tL_paymentSavedCredentialsCard;
        dl0Var.x0 = str;
        dl0Var.V0 = z10;
        dl0Var.y0 = str2;
        dl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.x8[] x8VarArr = dl0Var.Z;
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            x8Var.setVisibility(0);
            org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[0];
            String str4 = dl0Var.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = dl0Var.y0;
            } else {
                str3 = dl0Var.y0.substring(0, 1).toUpperCase() + dl0Var.y0.substring(1);
            }
            x8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.bd.M0(2131747422, null), true);
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

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void b() {
    }
}
