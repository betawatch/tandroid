package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ xm0(cn0 cn0Var, int i10) {
        this.a = i10;
        this.b = cn0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                cn0 cn0Var = this.b;
                cn0Var.c(true);
                cn0Var.Q.finishFragment();
                break;
            default:
                cn0 cn0Var2 = this.b;
                cn0Var2.c(true);
                cn0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
