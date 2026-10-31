package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn0 b;

    public /* synthetic */ un0(yn0 yn0Var, int i10) {
        this.a = i10;
        this.b = yn0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                yn0 yn0Var = this.b;
                yn0Var.Z(yn0Var.b, yn0Var.c, z10, i10);
                yn0Var.finishFragment();
                break;
            default:
                yn0 yn0Var2 = this.b;
                yn0Var2.Z(yn0Var2.b, yn0Var2.c, z10, i10);
                yn0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        yn0 yn0Var = this.b;
        yn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = yn0Var.I) != null && k1Var.isShowing()) {
            yn0Var.I.d(true);
        }
    }
}
