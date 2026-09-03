package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ oa1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ wd(me meVar, oa1 oa1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = meVar;
        this.c = oa1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.N0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.N0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
