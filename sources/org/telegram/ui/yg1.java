package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ yg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                hh1 hh1Var = this.b;
                hh1Var.B0();
                hh1Var.finishFragment();
                break;
            case 2:
                hh1 hh1Var2 = this.b;
                hh1Var2.R = "";
                hh1Var2.E0(false);
                break;
            case 3:
                hh1.a0(this.b);
                break;
            default:
                hh1.X(this.b);
                break;
        }
    }
}
