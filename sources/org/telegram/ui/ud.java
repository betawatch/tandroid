package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ ga1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ ud(ke keVar, ga1 ga1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = keVar;
        this.c = ga1Var;
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
