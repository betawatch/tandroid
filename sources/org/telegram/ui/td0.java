package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ud0 b;

    public /* synthetic */ td0(ud0 ud0Var, int i10) {
        this.a = i10;
        this.b = ud0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ud0 ud0Var = this.b;
                vd0 vd0Var = ud0Var.d;
                if (ud0Var.b) {
                    boolean z10 = vd0Var.K;
                    org.telegram.ui.Components.ci0 ci0Var = vd0Var.J;
                    hd hdVar = vd0Var.n;
                    if (z10 && System.currentTimeMillis() - ud0Var.a >= 10000) {
                        hdVar.setAnimation(ci0Var);
                        ci0Var.N(0, false, false);
                        ci0Var.t0 = new td0(ud0Var, 1);
                        hdVar.d();
                        ud0Var.a = System.currentTimeMillis();
                    }
                    hdVar.postDelayed(ud0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new td0(this.b, 2));
                break;
            default:
                vd0 vd0Var2 = this.b.d;
                org.telegram.ui.Components.ci0 ci0Var2 = vd0Var2.I;
                ci0Var2.N(0, false, false);
                vd0Var2.n.setAnimation(ci0Var2);
                break;
        }
    }
}
