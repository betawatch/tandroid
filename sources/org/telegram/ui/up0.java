package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq0 b;

    public /* synthetic */ up0(cq0 cq0Var, int i10) {
        this.a = i10;
        this.b = cq0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                cq0 cq0Var = this.b;
                cq0Var.W(cq0Var.b, cq0Var.c, z10, i10);
                cq0Var.finishFragment();
                break;
            default:
                cq0 cq0Var2 = this.b;
                cq0Var2.W(cq0Var2.b, cq0Var2.c, z10, i10);
                cq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        cq0 cq0Var = this.b;
        cq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = cq0Var.I) != null && o1Var.isShowing()) {
            cq0Var.I.d(true);
        }
    }
}
