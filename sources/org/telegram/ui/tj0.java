package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
