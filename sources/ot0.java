// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au0 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ ot0(au0 au0Var, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = au0Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        au0 au0Var = this.b;
        switch (b) {
            case 0:
                au0Var.i0.setLoading(false);
                au0Var.presentFragment(twoStepVerificationActivity);
                break;
            default:
                au0Var.b0.setLoading(false);
                au0Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
