package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ rm0(wm0 wm0Var, int i10) {
        this.a = i10;
        this.b = wm0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                wm0Var.c(true);
                wm0Var.Q.finishFragment();
                break;
            default:
                wm0 wm0Var2 = this.b;
                wm0Var2.c(true);
                wm0Var2.Q.J1(null, 0, true);
                break;
        }
    }
}
