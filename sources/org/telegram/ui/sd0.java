package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ sd0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b;
                ah0Var.b[ah0Var.a].d();
                ah0Var.k1(true, true);
                break;
            default:
                ah0 ah0Var2 = this.b;
                ah0Var2.l0 = true;
                if (ah0Var2.a != 0) {
                    ah0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
