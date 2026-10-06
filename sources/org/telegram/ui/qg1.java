package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ qg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                zg1.Z(this.b);
                break;
            default:
                zg1.W(this.b);
                break;
        }
    }
}
