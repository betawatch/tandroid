package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ uj0(vj0 vj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = vj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vj0 vj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                hk0 hk0Var = vj0Var.e;
                if (tLObject instanceof Vector) {
                    hk0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        hk0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    vj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.c5.u0(hk0Var.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, null), true);
                    } else {
                        hk0Var.Q1(org.telegram.messenger.hd.N0(R.string.AppName, null), tL_error.text);
                    }
                    hk0Var.R1(true, false);
                    break;
                }
            case 1:
                vj0 vj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vj0Var2.e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    vj0Var2.b();
                    break;
                } else {
                    vj0Var2.getClass();
                    break;
                }
            default:
                vj0 vj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    vj0Var3.e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new mc0(vj0Var3, vj0Var3.b, vj0Var3.d, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uj0(vj0 vj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = vj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
