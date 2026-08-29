package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ij0 ij0Var = eg0Var.a;
                fg0 fg0Var = eg0Var.R;
                bg0 bg0Var = eg0Var.b;
                if (bg0Var != null) {
                    if (fg0Var.Y) {
                        ij0Var.clearFocus();
                        bg0Var.clearFocus();
                    } else if (ij0Var.length() != 0) {
                        bg0Var.requestFocus();
                        if (!eg0Var.N) {
                            bg0Var.setSelection(bg0Var.length());
                        }
                        fg0.T0(fg0Var, bg0Var);
                    } else {
                        ij0Var.requestFocus();
                        fg0.T0(fg0Var, ij0Var);
                    }
                }
                if (fg0Var.B == 0) {
                    eg0Var.t(false);
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
                this.b.t(true);
                break;
            default:
                eg0 eg0Var3 = this.b;
                fg0.T0(eg0Var3.R, eg0Var3.b);
                break;
        }
    }
}
