// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
