package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ ta1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ vd(me meVar, ta1 ta1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = meVar;
        this.c = ta1Var;
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
