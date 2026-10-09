package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ ym0(zm0 zm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = zm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zm0 zm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                nn0 nn0Var = zm0Var.e;
                if (tLObject instanceof Vector) {
                    nn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        nn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    zm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.g5.w0(nn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        nn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    nn0Var.M1(true, false);
                    break;
                }
            case 1:
                zm0 zm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    zm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    zm0Var2.b();
                    break;
                } else {
                    zm0Var2.getClass();
                    break;
                }
            default:
                zm0 zm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    zm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new of0(zm0Var3, zm0Var3.b, zm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ym0(zm0 zm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = zm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
