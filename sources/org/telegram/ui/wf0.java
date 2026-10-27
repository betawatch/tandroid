package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ wf0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                oj0 oj0Var = hg0Var.a;
                ig0 ig0Var = hg0Var.a0;
                eg0 eg0Var = hg0Var.b;
                if (eg0Var != null) {
                    if (ig0Var.c0) {
                        oj0Var.clearFocus();
                        eg0Var.clearFocus();
                    } else if (oj0Var.length() != 0) {
                        eg0Var.requestFocus();
                        if (!hg0Var.T) {
                            eg0Var.setSelection(eg0Var.length());
                        }
                        ig0.W0(ig0Var, eg0Var);
                    } else {
                        oj0Var.requestFocus();
                        ig0.W0(ig0Var, oj0Var);
                    }
                }
                if (ig0Var.F == 0) {
                    hg0Var.r(false);
                    break;
                }
                break;
            case 1:
                hg0 hg0Var2 = this.b;
                hg0Var2.postDelayed(new wf0(hg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                hg0 hg0Var3 = this.b;
                ig0.W0(hg0Var3.a0, hg0Var3.b);
                break;
        }
    }
}
