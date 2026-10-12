package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ qg0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b;
                gk0 gk0Var = ah0Var.a;
                bh0 bh0Var = ah0Var.V;
                xg0 xg0Var = ah0Var.b;
                if (xg0Var != null) {
                    if (bh0Var.c0) {
                        gk0Var.clearFocus();
                        xg0Var.clearFocus();
                    } else if (gk0Var.length() != 0) {
                        xg0Var.requestFocus();
                        if (!ah0Var.R) {
                            xg0Var.setSelection(xg0Var.length());
                        }
                        bh0.T0(bh0Var, xg0Var);
                    } else {
                        gk0Var.requestFocus();
                        bh0.T0(bh0Var, gk0Var);
                    }
                }
                if (bh0Var.F == 0) {
                    ah0Var.s(false);
                    break;
                }
                break;
            case 1:
                ah0 ah0Var2 = this.b;
                ah0Var2.postDelayed(new qg0(ah0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.s(true);
                break;
            default:
                ah0 ah0Var3 = this.b;
                bh0.T0(ah0Var3.V, ah0Var3.b);
                break;
        }
    }
}
