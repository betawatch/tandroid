// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qi1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij1 b;
    public final /* synthetic */ w1b c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ qi1(ij1 ij1Var, w1b w1bVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ij1Var;
        this.c = w1bVar;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        w1b w1bVar = this.c;
        ij1 ij1Var = this.b;
        switch (b) {
            case 0:
                ij1Var.A0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                break;
            case 1:
                ij1Var.G0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                break;
            default:
                ij1Var.G0.setLoading(false);
                w1bVar.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
