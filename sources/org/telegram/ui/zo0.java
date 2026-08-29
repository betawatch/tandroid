package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp0 b;

    public /* synthetic */ zo0(hp0 hp0Var, int i10) {
        this.a = i10;
        this.b = hp0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                hp0 hp0Var = this.b;
                hp0Var.V(hp0Var.b, hp0Var.c, z10, i10);
                hp0Var.finishFragment();
                break;
            default:
                hp0 hp0Var2 = this.b;
                hp0Var2.V(hp0Var2.b, hp0Var2.c, z10, i10);
                hp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        hp0 hp0Var = this.b;
        hp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = hp0Var.E) != null && o1Var.isShowing()) {
            hp0Var.E.d(true);
        }
    }
}
