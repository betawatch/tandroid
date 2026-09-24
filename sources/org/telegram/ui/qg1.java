package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ qg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                zg1 zg1Var = this.b;
                zg1Var.B0();
                zg1Var.finishFragment();
                break;
            case 2:
                zg1 zg1Var2 = this.b;
                zg1Var2.R = "";
                zg1Var2.E0(false);
                break;
            case 3:
                zg1.a0(this.b);
                break;
            default:
                zg1.X(this.b);
                break;
        }
    }
}
