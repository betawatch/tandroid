package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ qj0(uj0 uj0Var, int i3) {
        this.a = i3;
        this.b = uj0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                uj0 uj0Var = this.b;
                uj0Var.c(true);
                uj0Var.R.finishFragment();
                break;
            default:
                uj0 uj0Var2 = this.b;
                uj0Var2.c(true);
                uj0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
