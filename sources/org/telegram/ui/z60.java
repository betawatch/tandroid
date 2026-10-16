package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ z60(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                j70 j70Var = this.b;
                j70Var.i0();
                j70Var.e0();
                break;
            case 2:
                j70 j70Var2 = this.b;
                j70Var2.getClass();
                j70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                j70 j70Var3 = this.b;
                j70Var3.n.postOnAnimation(new z60(j70Var3, 1));
                break;
        }
    }
}
