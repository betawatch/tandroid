package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ ua1(cb1 cb1Var, int i7) {
        this.a = i7;
        this.b = cb1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                cb1 cb1Var = this.b;
                cb1Var.G0();
                cb1Var.finishFragment();
                break;
            case 2:
                cb1 cb1Var2 = this.b;
                cb1Var2.R = "";
                cb1Var2.J0(false);
                break;
            case 3:
                cb1.f0(this.b);
                break;
            default:
                cb1.c0(this.b);
                break;
        }
    }
}
