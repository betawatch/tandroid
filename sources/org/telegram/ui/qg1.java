package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ qg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
