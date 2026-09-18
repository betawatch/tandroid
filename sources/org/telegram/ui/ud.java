package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ ab1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ ud(le leVar, ab1 ab1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = leVar;
        this.c = ab1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.Q0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.Q0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
