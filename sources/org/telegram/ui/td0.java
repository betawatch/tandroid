package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ td0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ce0 ce0Var = ee0Var.a;
                fe0 fe0Var = ee0Var.g0;
                ce0 ce0Var2 = ee0Var.b;
                if (ce0Var2 != null) {
                    if (fe0Var.c0) {
                        ce0Var.clearFocus();
                        ce0Var2.clearFocus();
                    } else if (ce0Var.length() != 0) {
                        ce0Var2.requestFocus();
                        if (!ee0Var.T) {
                            ce0Var2.setSelection(ce0Var2.length());
                        }
                        fe0.b1(fe0Var, ce0Var2);
                    } else {
                        ce0Var.requestFocus();
                        fe0.b1(fe0Var, ce0Var);
                    }
                }
                if (fe0Var.F == 0) {
                    ee0Var.s();
                    break;
                }
                break;
            case 1:
                ee0 ee0Var2 = this.b;
                ee0Var2.postDelayed(new td0(ee0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                ee0 ee0Var3 = this.b;
                fe0.b1(ee0Var3.g0, ee0Var3.b);
                break;
        }
    }
}
