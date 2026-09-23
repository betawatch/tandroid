package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    public /* synthetic */ vp0(dq0 dq0Var, int i10) {
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                dq0 dq0Var = this.b;
                dq0Var.V(dq0Var.b, dq0Var.c, z10, i10);
                dq0Var.finishFragment();
                break;
            default:
                dq0 dq0Var2 = this.b;
                dq0Var2.V(dq0Var2.b, dq0Var2.c, z10, i10);
                dq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        dq0 dq0Var = this.b;
        dq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = dq0Var.I) != null && n1Var.isShowing()) {
            dq0Var.I.d(true);
        }
    }
}
