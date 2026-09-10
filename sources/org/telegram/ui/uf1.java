package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf1 b;

    public /* synthetic */ uf1(vf1 vf1Var, int i10) {
        this.a = i10;
        this.b = vf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vf1 vf1Var = this.b;
                vf1Var.F = null;
                if (vf1Var.G != -1) {
                    vf1Var.H.getNotificationCenter().onAnimationFinish(vf1Var.G);
                    vf1Var.G = -1;
                    break;
                }
                break;
            default:
                vf1 vf1Var2 = this.b;
                vf1Var2.F = null;
                if (vf1Var2.G != -1) {
                    vf1Var2.H.getNotificationCenter().onAnimationFinish(vf1Var2.G);
                    vf1Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
