package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ ta1(bb1 bb1Var, int i7) {
        this.a = i7;
        this.b = bb1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                bb1 bb1Var = this.b;
                bb1Var.G0();
                bb1Var.finishFragment();
                break;
            case 2:
                bb1 bb1Var2 = this.b;
                bb1Var2.S = "";
                bb1Var2.J0(false);
                break;
            case 3:
                bb1.f0(this.b);
                break;
            default:
                bb1.c0(this.b);
                break;
        }
    }
}
