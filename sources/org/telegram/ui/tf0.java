package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ tf0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                lj0 lj0Var = dg0Var.a;
                eg0 eg0Var = dg0Var.V;
                ag0 ag0Var = dg0Var.b;
                if (ag0Var != null) {
                    if (eg0Var.c0) {
                        lj0Var.clearFocus();
                        ag0Var.clearFocus();
                    } else if (lj0Var.length() != 0) {
                        ag0Var.requestFocus();
                        if (!dg0Var.R) {
                            ag0Var.setSelection(ag0Var.length());
                        }
                        eg0.T0(eg0Var, ag0Var);
                    } else {
                        lj0Var.requestFocus();
                        eg0.T0(eg0Var, lj0Var);
                    }
                }
                if (eg0Var.F == 0) {
                    dg0Var.s(false);
                    break;
                }
                break;
            case 1:
                dg0 dg0Var2 = this.b;
                dg0Var2.postDelayed(new tf0(dg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.s(true);
                break;
            default:
                dg0 dg0Var3 = this.b;
                eg0.T0(dg0Var3.V, dg0Var3.b);
                break;
        }
    }
}
