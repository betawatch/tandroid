package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ ha1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ ud(ke keVar, ha1 ha1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = ha1Var;
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
