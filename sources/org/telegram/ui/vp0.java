package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ vp0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z4);
                break;
            default:
                this.b.e0(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        hq0 hq0Var = this.b;
        if (hq0Var.V) {
            hq0Var.a0(view, hq0Var.G.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.wl0 wl0Var = hq0Var.S;
        boolean z4 = !((org.telegram.ui.Cells.t5) view).a();
        hq0Var.U = z4;
        wl0Var.d(view, i10, z4);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        hq0 hq0Var = this.b;
        lq0 lq0Var = hq0Var.q0;
        if (lq0Var == null) {
            hq0Var.Z();
            return;
        }
        switch (lq0Var.a) {
            case 0:
                mq0 mq0Var = lq0Var.b;
                mq0Var.a.Z();
                mq0Var.b.Z();
                break;
            default:
                mq0 mq0Var2 = lq0Var.b;
                mq0Var2.a.Z();
                mq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        hq0 hq0Var = this.b;
        hq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = hq0Var.j0) != null && p1Var.isShowing()) {
            hq0Var.j0.d(true);
        }
    }
}
