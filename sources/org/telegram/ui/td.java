package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;
    public final /* synthetic */ u91 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ td(ie ieVar, u91 u91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = ieVar;
        this.c = u91Var;
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
