package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ uf0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                mj0 mj0Var = fg0Var.a;
                gg0 gg0Var = fg0Var.a0;
                cg0 cg0Var = fg0Var.b;
                if (cg0Var != null) {
                    if (gg0Var.c0) {
                        mj0Var.clearFocus();
                        cg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        cg0Var.requestFocus();
                        if (!fg0Var.T) {
                            cg0Var.setSelection(cg0Var.length());
                        }
                        gg0.W0(gg0Var, cg0Var);
                    } else {
                        mj0Var.requestFocus();
                        gg0.W0(gg0Var, mj0Var);
                    }
                }
                if (gg0Var.F == 0) {
                    fg0Var.r(false);
                    break;
                }
                break;
            case 1:
                fg0 fg0Var2 = this.b;
                fg0Var2.postDelayed(new uf0(fg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                fg0 fg0Var3 = this.b;
                gg0.W0(fg0Var3.a0, fg0Var3.b);
                break;
        }
    }
}
