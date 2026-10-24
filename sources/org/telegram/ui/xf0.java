package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ xf0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                pj0 pj0Var = hg0Var.a;
                ig0 ig0Var = hg0Var.a0;
                eg0 eg0Var = hg0Var.b;
                if (eg0Var != null) {
                    if (ig0Var.c0) {
                        pj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (pj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.T) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.V0(ig0Var, eg0Var);
                    } else {
                        pj0Var.requestFocus();
                        ig0.V0(ig0Var, pj0Var);
                    }
                }
                if (ig0Var.F == 0) {
                    hg0Var.r(false);
                    break;
                }
                break;
            case 1:
                hg0 hg0Var2 = this.b;
                hg0Var2.postDelayed(new xf0(hg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                hg0 hg0Var3 = this.b;
                ig0.V0(hg0Var3.a0, hg0Var3.b);
                break;
        }
    }
}
