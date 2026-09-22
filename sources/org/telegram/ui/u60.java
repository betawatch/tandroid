package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;

    public /* synthetic */ u60(e70 e70Var, int i10) {
        this.a = i10;
        this.b = e70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                e70 e70Var = this.b;
                e70Var.i0();
                e70Var.e0();
                break;
            case 2:
                e70 e70Var2 = this.b;
                e70Var2.getClass();
                e70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                e70 e70Var3 = this.b;
                e70Var3.n.postOnAnimation(new u60(e70Var3, 1));
                break;
        }
    }
}
