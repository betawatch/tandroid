package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ vc0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.b[ig0Var.a].d();
                ig0Var.p1(true, true);
                break;
            default:
                ig0 ig0Var2 = this.b;
                ig0Var2.l0 = true;
                if (ig0Var2.a != 0) {
                    ig0Var2.z1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
