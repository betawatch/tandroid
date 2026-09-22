package yh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TwoStepVerificationActivity d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ t0(z3 z3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.b = z3Var;
        this.c = tL_error;
        this.e = tLObject;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.getClass();
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.e;
                    TwoStepVerificationActivity twoStepVerificationActivity = this.d;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    z3Var.M1(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.d;
                z3.W0(this.b, this.c, this.e, twoStepVerificationActivity2);
                break;
        }
    }

    public /* synthetic */ t0(z3 z3Var, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        this.b = z3Var;
        this.c = tL_error;
        this.d = twoStepVerificationActivity;
        this.e = tLObject;
    }
}
