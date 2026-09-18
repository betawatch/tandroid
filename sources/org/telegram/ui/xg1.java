package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;

    public /* synthetic */ xg1(gh1 gh1Var, int i10) {
        this.a = i10;
        this.b = gh1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                gh1 gh1Var = this.b;
                gh1Var.B0();
                gh1Var.finishFragment();
                break;
            case 2:
                gh1 gh1Var2 = this.b;
                gh1Var2.R = "";
                gh1Var2.E0(false);
                break;
            case 3:
                gh1.a0(this.b);
                break;
            default:
                gh1.X(this.b);
                break;
        }
    }
}
