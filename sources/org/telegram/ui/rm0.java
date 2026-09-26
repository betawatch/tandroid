package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rm0(sm0 sm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = sm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sm0 sm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                gn0 gn0Var = sm0Var.e;
                if (tLObject instanceof Vector) {
                    gn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        gn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    sm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.e5.x0(gn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        gn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    gn0Var.N1(true, false);
                    break;
                }
            case 1:
                sm0 sm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    sm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    sm0Var2.b();
                    break;
                } else {
                    sm0Var2.getClass();
                    break;
                }
            default:
                sm0 sm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new jf0(sm0Var3, sm0Var3.b, sm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rm0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = sm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
