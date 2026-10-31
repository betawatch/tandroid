package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd0 b;

    public /* synthetic */ ud0(vd0 vd0Var, int i10) {
        this.a = i10;
        this.b = vd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vd0 vd0Var = this.b;
                wd0 wd0Var = vd0Var.d;
                if (vd0Var.b) {
                    boolean z10 = wd0Var.K;
                    org.telegram.ui.Components.bi0 bi0Var = wd0Var.J;
                    hd hdVar = wd0Var.n;
                    if (z10 && System.currentTimeMillis() - vd0Var.a >= 10000) {
                        hdVar.setAnimation(bi0Var);
                        bi0Var.N(0, false, false);
                        bi0Var.t0 = new ud0(vd0Var, 1);
                        hdVar.d();
                        vd0Var.a = System.currentTimeMillis();
                    }
                    hdVar.postDelayed(vd0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ud0(this.b, 2));
                break;
            default:
                wd0 wd0Var2 = this.b.d;
                org.telegram.ui.Components.bi0 bi0Var2 = wd0Var2.I;
                bi0Var2.N(0, false, false);
                wd0Var2.n.setAnimation(bi0Var2);
                break;
        }
    }
}
