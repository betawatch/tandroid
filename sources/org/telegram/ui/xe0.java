package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ xe0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                ef0 ef0Var = gf0Var.a;
                hf0 hf0Var = gf0Var.a0;
                ef0 ef0Var2 = gf0Var.b;
                if (ef0Var2 != null) {
                    if (hf0Var.c0) {
                        ef0Var.clearFocus();
                        ef0Var2.clearFocus();
                    } else if (ef0Var.length() != 0) {
                        ef0Var2.requestFocus();
                        if (!gf0Var.T) {
                            ef0Var2.setSelection(ef0Var2.length());
                        }
                        hf0.Z0(hf0Var, ef0Var2);
                    } else {
                        ef0Var.requestFocus();
                        hf0.Z0(hf0Var, ef0Var);
                    }
                }
                if (hf0Var.F == 0) {
                    gf0Var.r(false);
                    break;
                }
                break;
            case 1:
                gf0 gf0Var2 = this.b;
                gf0Var2.postDelayed(new xe0(gf0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                gf0 gf0Var3 = this.b;
                hf0.Z0(gf0Var3.a0, gf0Var3.b);
                break;
        }
    }
}
