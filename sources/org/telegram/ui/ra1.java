package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ ra1(za1 za1Var, int i7) {
        this.a = i7;
        this.b = za1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                za1Var2.S = "";
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
