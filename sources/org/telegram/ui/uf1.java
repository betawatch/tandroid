package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ uf1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                dg1 dg1Var = this.b;
                dg1Var.C0();
                dg1Var.finishFragment();
                break;
            case 2:
                dg1 dg1Var2 = this.b;
                dg1Var2.R = "";
                dg1Var2.F0(false);
                break;
            case 3:
                dg1.b0(this.b);
                break;
            default:
                dg1.Y(this.b);
                break;
        }
    }
}
