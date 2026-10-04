package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh1 b;

    public /* synthetic */ sg1(bh1 bh1Var, int i10) {
        this.a = i10;
        this.b = bh1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                bh1 bh1Var = this.b;
                bh1Var.B0();
                bh1Var.finishFragment();
                break;
            case 2:
                bh1 bh1Var2 = this.b;
                bh1Var2.R = "";
                bh1Var2.E0(false);
                break;
            case 3:
                bh1.Z(this.b);
                break;
            default:
                bh1.W(this.b);
                break;
        }
    }
}
