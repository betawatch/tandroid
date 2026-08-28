package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ uf0(eg0 eg0Var, int i9) {
        this.a = i9;
        this.b = eg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                kj0 kj0Var = eg0Var.a;
                fg0 fg0Var = eg0Var.R;
                bg0 bg0Var = eg0Var.b;
                if (bg0Var != null) {
                    if (fg0Var.Y) {
                        kj0Var.clearFocus();
                        bg0Var.clearFocus();
                    } else if (kj0Var.length() != 0) {
                        bg0Var.requestFocus();
                        if (!eg0Var.N) {
                            bg0Var.setSelection(bg0Var.length());
                        }
                        fg0.T0(fg0Var, bg0Var);
                    } else {
                        kj0Var.requestFocus();
                        fg0.T0(fg0Var, kj0Var);
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
