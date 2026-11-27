// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class os0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at0 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ os0(at0 at0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = at0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        at0 at0Var = this.b;
        switch (b) {
            case 0:
                at0Var.i0.setLoading(false);
                at0Var.presentFragment(twoStepVerificationActivity);
                break;
            default:
                at0Var.b0.setLoading(false);
                at0Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
