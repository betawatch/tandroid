package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fq0 b;

    public /* synthetic */ xp0(fq0 fq0Var, int i10) {
        this.a = i10;
        this.b = fq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                fq0 fq0Var = this.b;
                fq0Var.T(fq0Var.b, fq0Var.c, z10, i10);
                fq0Var.finishFragment();
                break;
            default:
                fq0 fq0Var2 = this.b;
                fq0Var2.T(fq0Var2.b, fq0Var2.c, z10, i10);
                fq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        fq0 fq0Var = this.b;
        fq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = fq0Var.I) != null && n1Var.isShowing()) {
            fq0Var.I.d(true);
        }
    }
}
