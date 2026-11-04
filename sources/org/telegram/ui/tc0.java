package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ tc0(dd0 dd0Var, int i3) {
        this.a = i3;
        this.b = dd0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                dd0 dd0Var = this.b;
                dd0Var.c(true);
                dd0Var.v0.D1(0, true, null, true);
                break;
            default:
                this.b.v0.D1(0, true, null, true);
                break;
        }
    }
}
