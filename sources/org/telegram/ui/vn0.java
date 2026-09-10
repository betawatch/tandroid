package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ vn0(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo0 wo0Var = this.b;
                wo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    wo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(wo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = wo0Var.C0;
                        if (paymentForm != null && wo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            wo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(wo0Var.a0);
                        wo0 wo0Var2 = wo0Var.f0;
                        if (wo0Var2 != null) {
                            wo0Var2.C0(wo0Var.a0);
                        }
                        if (!wo0Var.a0.has_password && wo0Var.d0 == null) {
                            tn0 tn0Var = new tn0(wo0Var, 3);
                            wo0Var.d0 = tn0Var;
                            AndroidUtilities.runOnUIThread(tn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                wo0.V(this.b, this.c, this.d);
                break;
            default:
                wo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
