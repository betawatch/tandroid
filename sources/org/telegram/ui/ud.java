package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ na1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ ud(ke keVar, na1 na1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = na1Var;
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
