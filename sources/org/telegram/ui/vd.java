package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ va1 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ vd(me meVar, va1 va1Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = meVar;
        this.c = va1Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D1.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.J1.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.J1.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
