package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
