package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ wf1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                fg1 fg1Var = this.b;
                fg1Var.C0();
                fg1Var.finishFragment();
                break;
            case 2:
                fg1 fg1Var2 = this.b;
                fg1Var2.R = "";
                fg1Var2.F0(false);
                break;
            case 3:
                fg1.b0(this.b);
                break;
            default:
                fg1.Y(this.b);
                break;
        }
    }
}
