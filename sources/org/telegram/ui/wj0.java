package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak0 b;

    public /* synthetic */ wj0(ak0 ak0Var, int i7) {
        this.a = i7;
        this.b = ak0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ak0 ak0Var = this.b;
                ak0Var.c(true);
                ak0Var.Q.finishFragment();
                break;
            default:
                ak0 ak0Var2 = this.b;
                ak0Var2.c(true);
                ak0Var2.Q.O1(null, 0, true);
                break;
        }
    }
}
