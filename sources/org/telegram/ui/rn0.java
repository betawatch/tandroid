package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rn0(ro0 ro0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ro0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro0 ro0Var = this.b;
                ro0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ro0Var.a0 = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ro0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = ro0Var.C0;
                        if (paymentForm != null && ro0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            ro0Var.L0();
                        }
                        TwoStepVerificationActivity.n0(ro0Var.a0);
                        ro0 ro0Var2 = ro0Var.f0;
                        if (ro0Var2 != null) {
                            ro0Var2.D0(ro0Var.a0);
                        }
                        if (!ro0Var.a0.has_password && ro0Var.d0 == null) {
                            pn0 pn0Var = new pn0(ro0Var, 3);
                            ro0Var.d0 = pn0Var;
                            AndroidUtilities.runOnUIThread(pn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ro0.W(this.b, this.c, this.d);
                break;
            default:
                ro0.Y(this.b, this.c, this.d);
                break;
        }
    }
}
