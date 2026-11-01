package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ we0(ff0 ff0Var, int i10) {
        this.a = i10;
        this.b = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                df0 df0Var = ff0Var.a;
                gf0 gf0Var = ff0Var.a0;
                df0 df0Var2 = ff0Var.b;
                if (df0Var2 != null) {
                    if (gf0Var.c0) {
                        df0Var.clearFocus();
                        df0Var2.clearFocus();
                    } else if (df0Var.length() != 0) {
                        df0Var2.requestFocus();
                        if (!ff0Var.T) {
                            df0Var2.setSelection(df0Var2.length());
                        }
                        gf0.a1(gf0Var, df0Var2);
                    } else {
                        df0Var.requestFocus();
                        gf0.a1(gf0Var, df0Var);
                    }
                }
                if (gf0Var.F == 0) {
                    ff0Var.r(false);
                    break;
                }
                break;
            case 1:
                ff0 ff0Var2 = this.b;
                ff0Var2.postDelayed(new we0(ff0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.r(true);
                break;
            default:
                ff0 ff0Var3 = this.b;
                gf0.a1(ff0Var3.a0, ff0Var3.b);
                break;
        }
    }
}
