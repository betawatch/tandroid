package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ xk0(yk0 yk0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = yk0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yk0 yk0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                ll0 ll0Var = yk0Var.e;
                if (tLObject instanceof Vector) {
                    ll0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ll0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    yk0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.s4.w0(ll0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                    } else {
                        ll0Var.P1(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error.text);
                    }
                    ll0Var.Q1(true, false);
                    break;
                }
            case 1:
                yk0 yk0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    yk0Var2.e.J = password;
                    TwoStepVerificationActivity.q0(password);
                    yk0Var2.b();
                    break;
                } else {
                    yk0Var2.getClass();
                    break;
                }
            default:
                yk0 yk0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    yk0Var3.e.J = password2;
                    TwoStepVerificationActivity.q0(password2);
                    Utilities.e.c(new qd0(yk0Var3, yk0Var3.b, yk0Var3.d, 15));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xk0(yk0 yk0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = yk0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
