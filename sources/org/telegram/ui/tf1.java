package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ tf1(cg1 cg1Var, int i10) {
        this.a = i10;
        this.b = cg1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                cg1 cg1Var = this.b;
                cg1Var.B0();
                cg1Var.finishFragment();
                break;
            case 2:
                cg1 cg1Var2 = this.b;
                cg1Var2.N = "";
                cg1Var2.E0(false);
                break;
            case 3:
                cg1.a0(this.b);
                break;
            default:
                cg1.X(this.b);
                break;
        }
    }
}
