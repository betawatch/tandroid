package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ uc0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                dg0Var.b[dg0Var.a].d();
                dg0Var.k1(true, true);
                break;
            default:
                dg0 dg0Var2 = this.b;
                dg0Var2.l0 = true;
                if (dg0Var2.a != 0) {
                    dg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
