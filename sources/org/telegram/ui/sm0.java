package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm0 implements org.telegram.ui.Components.z4, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ sm0(an0 an0Var, int i7) {
        this.a = i7;
        this.b = an0Var;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.j0(i7, z10);
                break;
            default:
                this.b.j0(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        an0 an0Var = this.b;
        if (an0Var.Z) {
            an0Var.f0(view, an0Var.K.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.r5)) {
            return false;
        }
        org.telegram.ui.Components.ik0 ik0Var = an0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
        an0Var.Y = z10;
        ik0Var.d(i7, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        an0 an0Var = this.b;
        bn0 bn0Var = an0Var.u0;
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
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        an0 an0Var = this.b;
        an0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = an0Var.n0) != null && g1Var.isShowing()) {
            an0Var.n0.d(true);
        }
    }
}
