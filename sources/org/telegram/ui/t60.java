package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d70 b;

    public /* synthetic */ t60(d70 d70Var, int i10) {
        this.a = i10;
        this.b = d70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                d70 d70Var = this.b;
                d70Var.i0();
                d70Var.e0();
                break;
            case 2:
                d70 d70Var2 = this.b;
                d70Var2.getClass();
                d70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                d70 d70Var3 = this.b;
                d70Var3.n.postOnAnimation(new t60(d70Var3, 1));
                break;
        }
    }
}
