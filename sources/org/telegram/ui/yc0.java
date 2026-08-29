package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ yc0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.b[fg0Var.a].d();
                fg0Var.k1(true, true);
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.h0 = true;
                if (fg0Var2.a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
