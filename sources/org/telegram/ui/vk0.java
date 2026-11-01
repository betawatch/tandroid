package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ vk0(wk0 wk0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = wk0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wk0 wk0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                jl0 jl0Var = wk0Var.e;
                if (tLObject instanceof Vector) {
                    jl0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jl0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    wk0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.s4.w0(jl0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                    } else {
                        jl0Var.Q1(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error.text);
                    }
                    jl0Var.R1(true, false);
                    break;
                }
            case 1:
                wk0 wk0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    wk0Var2.e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    wk0Var2.b();
                    break;
                } else {
                    wk0Var2.getClass();
                    break;
                }
            default:
                wk0 wk0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    wk0Var3.e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new pd0(wk0Var3, wk0Var3.b, wk0Var3.d, 15));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vk0(wk0 wk0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wk0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
