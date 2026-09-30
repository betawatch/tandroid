package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;
    public final /* synthetic */ sa1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ sd(je jeVar, sa1 sa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = jeVar;
        this.c = sa1Var;
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
