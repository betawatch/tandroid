package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh0 b;

    public /* synthetic */ ud0(bh0 bh0Var, int i10) {
        this.a = i10;
        this.b = bh0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                bh0 bh0Var = this.b;
                bh0Var.b[bh0Var.a].d();
                bh0Var.k1(true, true);
                break;
            default:
                bh0 bh0Var2 = this.b;
                bh0Var2.l0 = true;
                if (bh0Var2.a != 0) {
                    bh0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
