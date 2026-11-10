package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rj0(sj0 sj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = sj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj0 sj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                ek0 ek0Var = sj0Var.e;
                if (tLObject instanceof Vector) {
                    ek0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ek0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    sj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.u4.u0(ek0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                    } else {
                        ek0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                    }
                    ek0Var.R1(true, false);
                    break;
                }
            case 1:
                sj0 sj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    sj0Var2.e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    sj0Var2.b();
                    break;
                } else {
                    sj0Var2.getClass();
                    break;
                }
            default:
                sj0 sj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sj0Var3.e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new pc0(sj0Var3, sj0Var3.b, sj0Var3.d, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rj0(sj0 sj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = sj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
