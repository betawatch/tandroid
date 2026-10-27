package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;

    public /* synthetic */ sj0(zj0 zj0Var, int i10) {
        this.a = i10;
        this.b = zj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zj0 zj0Var;
        int i10;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.I1;
                rh.e eVar = launchActivity != null ? launchActivity.h1 : null;
                if ((eVar == null || eVar.c <= 0) && zj0Var.J != (i10 = (zj0Var = this.b).K)) {
                    zj0Var.J = i10;
                    zj0Var.p0(false);
                    break;
                }
                break;
            case 1:
                this.b.y.setVisibility(8);
                break;
            default:
                zj0 zj0Var2 = this.b;
                zj0Var2.O = null;
                zj0Var2.l0(2, true);
                break;
        }
    }
}
