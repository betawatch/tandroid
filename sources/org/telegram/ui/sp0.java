package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ sp0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                aq0 aq0Var = this.b;
                aq0Var.W(aq0Var.b, aq0Var.c, z10, i10);
                aq0Var.finishFragment();
                break;
            default:
                aq0 aq0Var2 = this.b;
                aq0Var2.W(aq0Var2.b, aq0Var2.c, z10, i10);
                aq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        aq0 aq0Var = this.b;
        aq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = aq0Var.I) != null && o1Var.isShowing()) {
            aq0Var.I.d(true);
        }
    }
}
