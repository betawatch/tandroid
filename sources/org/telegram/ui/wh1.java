package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh1 b;

    public /* synthetic */ wh1(xh1 xh1Var, int i10) {
        this.a = i10;
        this.b = xh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.b71 b71Var = this.b.a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.b71 b71Var2 = this.b.a;
                if (b71Var2 != null) {
                    b71Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
