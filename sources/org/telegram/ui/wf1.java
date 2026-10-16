package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf1 b;

    public /* synthetic */ wf1(xf1 xf1Var, int i10) {
        this.a = i10;
        this.b = xf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xf1 xf1Var = this.b;
                xf1Var.F = null;
                if (xf1Var.G != -1) {
                    xf1Var.H.getNotificationCenter().onAnimationFinish(xf1Var.G);
                    xf1Var.G = -1;
                    break;
                }
                break;
            default:
                xf1 xf1Var2 = this.b;
                xf1Var2.F = null;
                if (xf1Var2.G != -1) {
                    xf1Var2.H.getNotificationCenter().onAnimationFinish(xf1Var2.G);
                    xf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
