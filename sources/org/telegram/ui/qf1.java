package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf1 b;

    public /* synthetic */ qf1(rf1 rf1Var, int i10) {
        this.a = i10;
        this.b = rf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rf1 rf1Var = this.b;
                rf1Var.F = null;
                if (rf1Var.G != -1) {
                    rf1Var.H.getNotificationCenter().onAnimationFinish(rf1Var.G);
                    rf1Var.G = -1;
                    break;
                }
                break;
            default:
                rf1 rf1Var2 = this.b;
                rf1Var2.F = null;
                if (rf1Var2.G != -1) {
                    rf1Var2.H.getNotificationCenter().onAnimationFinish(rf1Var2.G);
                    rf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
