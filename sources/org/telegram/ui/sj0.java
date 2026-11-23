package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ sj0(tj0 tj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = tj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tj0 tj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                fk0 fk0Var = tj0Var.e;
                if (tLObject instanceof Vector) {
                    fk0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        fk0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    tj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.b5.u0(fk0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
                    } else {
                        fk0Var.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error.text);
                    }
                    fk0Var.R1(true, false);
                    break;
                }
            case 1:
                tj0 tj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    tj0Var2.e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    tj0Var2.b();
                    break;
                } else {
                    tj0Var2.getClass();
                    break;
                }
            default:
                tj0 tj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    tj0Var3.e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new lc0(tj0Var3, tj0Var3.b, tj0Var3.d, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sj0(tj0 tj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = tj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
