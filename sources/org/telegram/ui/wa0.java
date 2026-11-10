package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ wa0(fe0 fe0Var, int i7) {
        this.a = i7;
        this.b = fe0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                fe0 fe0Var = this.b;
                fe0Var.b[fe0Var.a].d();
                fe0Var.C1(true, true);
                break;
            default:
                fe0 fe0Var2 = this.b;
                fe0Var2.l0 = true;
                if (fe0Var2.a != 0) {
                    fe0Var2.M1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
