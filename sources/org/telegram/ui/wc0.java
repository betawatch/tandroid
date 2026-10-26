package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ wc0(gg0 gg0Var, int i10) {
        this.a = i10;
        this.b = gg0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                gg0 gg0Var = this.b;
                gg0Var.b[gg0Var.a].d();
                gg0Var.p1(true, true);
                break;
            default:
                gg0 gg0Var2 = this.b;
                gg0Var2.l0 = true;
                if (gg0Var2.a != 0) {
                    gg0Var2.z1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
