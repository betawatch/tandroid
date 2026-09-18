package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf1 b;

    public /* synthetic */ rf1(sf1 sf1Var, int i10) {
        this.a = i10;
        this.b = sf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sf1 sf1Var = this.b;
                sf1Var.F = null;
                if (sf1Var.G != -1) {
                    sf1Var.H.getNotificationCenter().onAnimationFinish(sf1Var.G);
                    sf1Var.G = -1;
                    break;
                }
                break;
            default:
                sf1 sf1Var2 = this.b;
                sf1Var2.F = null;
                if (sf1Var2.G != -1) {
                    sf1Var2.H.getNotificationCenter().onAnimationFinish(sf1Var2.G);
                    sf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
