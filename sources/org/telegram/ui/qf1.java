package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
