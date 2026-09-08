package zh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ t0(w3 w3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.b = w3Var;
        this.c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.getClass();
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    w3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                w3.W0(this.b, this.c, this.e, twoStepVerificationActivity2);
                break;
        }
    }

    public /* synthetic */ t0(w3 w3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.b = w3Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}
