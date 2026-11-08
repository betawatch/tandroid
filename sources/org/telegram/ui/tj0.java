package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public /* synthetic */ tj0(xj0 xj0Var, int i7) {
        this.a = i7;
        this.b = xj0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                xj0 xj0Var = this.b;
                xj0Var.c(true);
                xj0Var.Q.finishFragment();
                break;
            default:
                xj0 xj0Var2 = this.b;
                xj0Var2.c(true);
                xj0Var2.Q.O1(null, 0, true);
                break;
        }
    }
}
