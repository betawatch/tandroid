package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ ra1(za1 za1Var, int i7) {
        this.a = i7;
        this.b = za1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                za1 za1Var = this.b;
                za1Var.G0();
                za1Var.finishFragment();
                break;
            case 2:
                za1 za1Var2 = this.b;
                za1Var2.R = "";
                za1Var2.J0(false);
                break;
            case 3:
                za1.f0(this.b);
                break;
            default:
                za1.c0(this.b);
                break;
        }
    }
}
