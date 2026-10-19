package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ sf0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cg0 cg0Var = this.b;
                kj0 kj0Var = cg0Var.a;
                dg0 dg0Var = cg0Var.V;
                zf0 zf0Var = cg0Var.b;
                if (zf0Var != null) {
                    if (dg0Var.c0) {
                        kj0Var.clearFocus();
                        zf0Var.clearFocus();
                    } else if (kj0Var.length() != 0) {
                        zf0Var.requestFocus();
                        if (!cg0Var.R) {
                            zf0Var.setSelection(zf0Var.length());
                        }
                        dg0.T0(dg0Var, zf0Var);
                    } else {
                        kj0Var.requestFocus();
                        dg0.T0(dg0Var, kj0Var);
                    }
                }
                if (dg0Var.F == 0) {
                    cg0Var.s(false);
                    break;
                }
                break;
            case 1:
                cg0 cg0Var2 = this.b;
                cg0Var2.postDelayed(new sf0(cg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.s(true);
                break;
            default:
                cg0 cg0Var3 = this.b;
                dg0.T0(cg0Var3.V, cg0Var3.b);
                break;
        }
    }
}
