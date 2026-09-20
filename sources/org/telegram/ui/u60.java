package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
