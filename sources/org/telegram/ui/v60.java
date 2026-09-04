package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;

    public /* synthetic */ v60(f70 f70Var, int i10) {
        this.a = i10;
        this.b = f70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                f70 f70Var = this.b;
                f70Var.i0();
                f70Var.e0();
                break;
            case 2:
                f70 f70Var2 = this.b;
                f70Var2.getClass();
                f70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                f70 f70Var3 = this.b;
                f70Var3.n.postOnAnimation(new v60(f70Var3, 1));
                break;
        }
    }
}
