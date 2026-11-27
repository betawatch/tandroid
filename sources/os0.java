// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
