package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf1 b;

    public /* synthetic */ xf1(yf1 yf1Var, int i10) {
        this.a = i10;
        this.b = yf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yf1 yf1Var = this.b;
                yf1Var.F = null;
                if (yf1Var.G != -1) {
                    yf1Var.H.getNotificationCenter().onAnimationFinish(yf1Var.G);
                    yf1Var.G = -1;
                    break;
                }
                break;
            default:
                yf1 yf1Var2 = this.b;
                yf1Var2.F = null;
                if (yf1Var2.G != -1) {
                    yf1Var2.H.getNotificationCenter().onAnimationFinish(yf1Var2.G);
                    yf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
