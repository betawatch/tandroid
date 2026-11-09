package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;

    public /* synthetic */ vj0(zj0 zj0Var, int i7) {
        this.a = i7;
        this.b = zj0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                zj0 zj0Var = this.b;
                zj0Var.c(true);
                zj0Var.Q.finishFragment();
                break;
            default:
                zj0 zj0Var2 = this.b;
                zj0Var2.c(true);
                zj0Var2.Q.O1(null, 0, true);
                break;
        }
    }
}
