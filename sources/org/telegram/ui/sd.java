package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ u61 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ sd(le leVar, u61 u61Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = leVar;
        this.c = u61Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.G0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.G0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
