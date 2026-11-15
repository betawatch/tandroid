package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;

    public /* synthetic */ sm0(zm0 zm0Var, int i7) {
        this.a = i7;
        this.b = zm0Var;
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
        zm0 zm0Var = this.b;
        if (zm0Var.Z) {
            zm0Var.f0(view, zm0Var.K.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.yj0 yj0Var = zm0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
        zm0Var.Y = z10;
        yj0Var.d(i7, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        zm0 zm0Var = this.b;
        an0 an0Var = zm0Var.u0;
        if (an0Var == null) {
            zm0Var.e0();
            return;
        }
        switch (an0Var.a) {
            case 1:
                cn0 cn0Var = an0Var.b;
                cn0Var.a.e0();
                cn0Var.b.e0();
                break;
            default:
                cn0 cn0Var2 = an0Var.b;
                cn0Var2.a.e0();
                cn0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        zm0 zm0Var = this.b;
        zm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = zm0Var.n0) != null && g1Var.isShowing()) {
            zm0Var.n0.d(true);
        }
    }
}
