package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements org.telegram.ui.Components.s4, org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ tm0(an0 an0Var, int i7) {
        this.a = i7;
        this.b = an0Var;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                this.b.j0(i7, z9);
                break;
            default:
                this.b.j0(i7, z9);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        an0 an0Var = this.b;
        if (an0Var.Y) {
            an0Var.f0(view, an0Var.J.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.tj0 tj0Var = an0Var.V;
        boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
        an0Var.X = z9;
        tj0Var.d(i7, view, z9);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an0 an0Var = this.b;
        bn0 bn0Var = an0Var.t0;
        if (bn0Var == null) {
            an0Var.e0();
            return;
        }
        switch (bn0Var.a) {
            case 1:
                dn0 dn0Var = bn0Var.b;
                dn0Var.a.e0();
                dn0Var.b.e0();
                break;
            default:
                dn0 dn0Var2 = bn0Var.b;
                dn0Var2.a.e0();
                dn0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        an0 an0Var = this.b;
        an0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = an0Var.m0) != null && g1Var.isShowing()) {
            an0Var.m0.d(true);
        }
    }
}
