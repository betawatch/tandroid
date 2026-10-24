package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg1 b;

    public /* synthetic */ sf1(bg1 bg1Var, int i10) {
        this.a = i10;
        this.b = bg1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                bg1 bg1Var = this.b;
                bg1Var.B0();
                bg1Var.finishFragment();
                break;
            case 2:
                bg1 bg1Var2 = this.b;
                bg1Var2.R = "";
                bg1Var2.E0(false);
                break;
            case 3:
                bg1.a0(this.b);
                break;
            default:
                bg1.X(this.b);
                break;
        }
    }
}
