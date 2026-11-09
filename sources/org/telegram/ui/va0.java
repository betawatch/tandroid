package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class va0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ va0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ee0Var.b[ee0Var.a].d();
                ee0Var.C1(true, true);
                break;
            default:
                ee0 ee0Var2 = this.b;
                ee0Var2.l0 = true;
                if (ee0Var2.a != 0) {
                    ee0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
