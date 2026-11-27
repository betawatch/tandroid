// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pi1 implements b7c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij1 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ pi1(ij1 ij1Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ij1Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                ij1Var.G(false, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            case 1:
                ij1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
            default:
                ij1Var.G(true, tL_inputCheckPasswordSRP, twoStepVerificationActivity);
                break;
        }
    }
}
