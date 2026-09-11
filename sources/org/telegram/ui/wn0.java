package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ wn0(xo0 xo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = xo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo0 xo0Var = this.b;
                xo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    xo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(xo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = xo0Var.C0;
                        if (paymentForm != null && xo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            xo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(xo0Var.a0);
                        xo0 xo0Var2 = xo0Var.f0;
                        if (xo0Var2 != null) {
                            xo0Var2.C0(xo0Var.a0);
                        }
                        if (!xo0Var.a0.has_password && xo0Var.d0 == null) {
                            un0 un0Var = new un0(xo0Var, 3);
                            xo0Var.d0 = un0Var;
                            AndroidUtilities.runOnUIThread(un0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                xo0.V(this.b, this.c, this.d);
                break;
            default:
                xo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
