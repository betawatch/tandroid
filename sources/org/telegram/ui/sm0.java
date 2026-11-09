package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm0 implements org.telegram.ui.Components.t4, org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;

    public /* synthetic */ sm0(zm0 zm0Var, int i7) {
        this.a = i7;
        this.b = zm0Var;
    }

    @Override // org.telegram.ui.Components.t4
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

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        zm0 zm0Var = this.b;
        if (zm0Var.Y) {
            zm0Var.f0(view, zm0Var.J.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.uj0 uj0Var = zm0Var.V;
        boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
        zm0Var.X = z9;
        uj0Var.d(i7, view, z9);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        zm0 zm0Var = this.b;
        an0 an0Var = zm0Var.t0;
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
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = zm0Var.m0) != null && g1Var.isShowing()) {
            zm0Var.m0.d(true);
        }
    }
}
