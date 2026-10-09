package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ un0(vo0 vo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = vo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo0 vo0Var = this.b;
                vo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    vo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(vo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = vo0Var.C0;
                        if (paymentForm != null && vo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            vo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(vo0Var.a0);
                        vo0 vo0Var2 = vo0Var.f0;
                        if (vo0Var2 != null) {
                            vo0Var2.C0(vo0Var.a0);
                        }
                        if (!vo0Var.a0.has_password && vo0Var.d0 == null) {
                            sn0 sn0Var = new sn0(vo0Var, 3);
                            vo0Var.d0 = sn0Var;
                            AndroidUtilities.runOnUIThread(sn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                vo0.V(this.b, this.c, this.d);
                break;
            default:
                vo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
