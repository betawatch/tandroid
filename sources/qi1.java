// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
