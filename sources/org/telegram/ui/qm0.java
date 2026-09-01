package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ qm0(rm0 rm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = rm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rm0 rm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                fn0 fn0Var = rm0Var.e;
                if (tLObject instanceof Vector) {
                    fn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        fn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    rm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.z4.x0(fn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        fn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    fn0Var.N1(true, false);
                    break;
                }
            case 1:
                rm0 rm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    rm0Var2.e.G = password;
                    TwoStepVerificationActivity.m0(password);
                    rm0Var2.b();
                    break;
                } else {
                    rm0Var2.getClass();
                    break;
                }
            default:
                rm0 rm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    rm0Var3.e.G = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new if0(rm0Var3, rm0Var3.b, rm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qm0(rm0 rm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = rm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
