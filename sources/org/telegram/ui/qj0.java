package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ qj0(rj0 rj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = rj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rj0 rj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                dk0 dk0Var = rj0Var.e;
                if (tLObject instanceof Vector) {
                    dk0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        dk0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    rj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.v4.u0(dk0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                    } else {
                        dk0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                    }
                    dk0Var.R1(true, false);
                    break;
                }
            case 1:
                rj0 rj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    rj0Var2.e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    rj0Var2.b();
                    break;
                } else {
                    rj0Var2.getClass();
                    break;
                }
            default:
                rj0 rj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    rj0Var3.e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new oc0(rj0Var3, rj0Var3.b, rj0Var3.d, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qj0(rj0 rj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = rj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
