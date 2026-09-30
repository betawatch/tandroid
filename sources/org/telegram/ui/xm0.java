package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
