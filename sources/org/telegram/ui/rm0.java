package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym0 b;

    public /* synthetic */ rm0(ym0 ym0Var, int i7) {
        this.a = i7;
        this.b = ym0Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.j0(i7, z10);
                break;
            default:
                this.b.j0(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        ym0 ym0Var = this.b;
        if (ym0Var.Z) {
            ym0Var.f0(view, ym0Var.K.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.yj0 yj0Var = ym0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
        ym0Var.Y = z10;
        yj0Var.d(i7, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ym0 ym0Var = this.b;
        zm0 zm0Var = ym0Var.u0;
        if (zm0Var == null) {
            ym0Var.e0();
            return;
        }
        switch (zm0Var.a) {
            case 1:
                bn0 bn0Var = zm0Var.b;
                bn0Var.a.e0();
                bn0Var.b.e0();
                break;
            default:
                bn0 bn0Var2 = zm0Var.b;
                bn0Var2.a.e0();
                bn0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        ym0 ym0Var = this.b;
        ym0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = ym0Var.n0) != null && g1Var.isShowing()) {
            ym0Var.n0.d(true);
        }
    }
}
