package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ sd0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                be0 be0Var = de0Var.a;
                ee0 ee0Var = de0Var.g0;
                be0 be0Var2 = de0Var.b;
                if (be0Var2 != null) {
                    if (ee0Var.c0) {
                        be0Var.clearFocus();
                        be0Var2.clearFocus();
                    } else if (be0Var.length() != 0) {
                        be0Var2.requestFocus();
                        if (!de0Var.T) {
                            be0Var2.setSelection(be0Var2.length());
                        }
                        ee0.b1(ee0Var, be0Var2);
                    } else {
                        be0Var.requestFocus();
                        ee0.b1(ee0Var, be0Var);
                    }
                }
                if (ee0Var.F == 0) {
                    de0Var.s();
                    break;
                }
                break;
            case 1:
                de0 de0Var2 = this.b;
                de0Var2.postDelayed(new sd0(de0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                de0 de0Var3 = this.b;
                ee0.b1(de0Var3.g0, de0Var3.b);
                break;
        }
    }
}
