package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ qd0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                xg0Var.b[xg0Var.a].d();
                xg0Var.k1(true, true);
                break;
            default:
                xg0 xg0Var2 = this.b;
                xg0Var2.l0 = true;
                if (xg0Var2.a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
