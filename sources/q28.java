// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q28 implements y28 {
    public final /* synthetic */ p a;

    public q28(p pVar) {
        this.a = pVar;
    }

    @Override // y28
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // y28
    public final void b() {
        this.a.g0 = null;
    }

    @Override // y28
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        p pVar = this.a;
        y28 y28Var = pVar.U;
        if (y28Var != null) {
            y28Var.c(str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (pVar.T0) {
            pVar.removeSelfFromStack();
        }
        return pVar.U != null;
    }

    @Override // y28
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
