package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;

    public /* synthetic */ um0(zm0 zm0Var, int i10) {
        this.a = i10;
        this.b = zm0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                zm0 zm0Var = this.b;
                zm0Var.c(true);
                zm0Var.N.finishFragment();
                break;
            default:
                zm0 zm0Var2 = this.b;
                zm0Var2.c(true);
                zm0Var2.N.K1(null, 0, true);
                break;
        }
    }
}
