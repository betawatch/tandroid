package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sc0(nd0 nd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = nd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                nd0 nd0Var = this.b;
                if (!z10) {
                    nd0Var.b.setVisibility(8);
                    break;
                } else {
                    nd0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
