// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pj1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ik1 b;
    public final /* synthetic */ xza c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ pj1(ik1 ik1Var, xza xzaVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = ik1Var;
        this.c = xzaVar;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        xza xzaVar = this.c;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                ik1Var.A0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                break;
            case 1:
                ik1Var.G0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                break;
            default:
                ik1Var.G0.setLoading(false);
                xzaVar.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
