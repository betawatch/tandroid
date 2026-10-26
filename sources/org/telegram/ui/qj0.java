package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public /* synthetic */ qj0(xj0 xj0Var, int i10) {
        this.a = i10;
        this.b = xj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj0 xj0Var;
        int i10;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.I1;
                rh.e eVar = launchActivity != null ? launchActivity.h1 : null;
                if ((eVar == null || eVar.c <= 0) && xj0Var.J != (i10 = (xj0Var = this.b).K)) {
                    xj0Var.J = i10;
                    xj0Var.p0(false);
                    break;
                }
                break;
            case 1:
                this.b.y.setVisibility(8);
                break;
            default:
                xj0 xj0Var2 = this.b;
                xj0Var2.O = null;
                xj0Var2.l0(2, true);
                break;
        }
    }
}
