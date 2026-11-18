package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ zj0(dk0 dk0Var, int i7) {
        this.a = i7;
        this.b = dk0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.b;
                dk0Var.c(true);
                dk0Var.R.finishFragment();
                break;
            default:
                dk0 dk0Var2 = this.b;
                dk0Var2.c(true);
                dk0Var2.R.O1(null, 0, true);
                break;
        }
    }
}
