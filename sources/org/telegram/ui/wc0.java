package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ wc0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.b[fg0Var.a].d();
                fg0Var.k1(true, true);
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.l0 = true;
                if (fg0Var2.a != 0) {
                    fg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
