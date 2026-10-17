package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ uf0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                mj0 mj0Var = eg0Var.a;
                fg0 fg0Var = eg0Var.V;
                bg0 bg0Var = eg0Var.b;
                if (bg0Var != null) {
                    if (fg0Var.c0) {
                        mj0Var.clearFocus();
                        bg0Var.clearFocus();
                    } else if (mj0Var.length() != 0) {
                        bg0Var.requestFocus();
                        if (!eg0Var.R) {
                            bg0Var.setSelection(bg0Var.length());
                        }
                        fg0.T0(fg0Var, bg0Var);
                    } else {
                        mj0Var.requestFocus();
                        fg0.T0(fg0Var, mj0Var);
                    }
                }
                if (fg0Var.F == 0) {
                    eg0Var.s(false);
                    break;
                }
                break;
            case 1:
                eg0 eg0Var2 = this.b;
                eg0Var2.postDelayed(new uf0(eg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.s(true);
                break;
            default:
                eg0 eg0Var3 = this.b;
                fg0.T0(eg0Var3.V, eg0Var3.b);
                break;
        }
    }
}
