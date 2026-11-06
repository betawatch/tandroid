package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm0 implements org.telegram.ui.Components.t4, org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ qm0(xm0 xm0Var, int i7) {
        this.a = i7;
        this.b = xm0Var;
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

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        xm0 xm0Var = this.b;
        if (xm0Var.Y) {
            xm0Var.f0(view, xm0Var.J.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.tj0 tj0Var = xm0Var.V;
        boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
        xm0Var.X = z9;
        tj0Var.d(i7, view, z9);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        xm0 xm0Var = this.b;
        ym0 ym0Var = xm0Var.t0;
        if (ym0Var == null) {
            xm0Var.e0();
            return;
        }
        switch (ym0Var.a) {
            case 1:
                an0 an0Var = ym0Var.b;
                an0Var.a.e0();
                an0Var.b.e0();
                break;
            default:
                an0 an0Var2 = ym0Var.b;
                an0Var2.a.e0();
                an0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        xm0 xm0Var = this.b;
        xm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = xm0Var.m0) != null && g1Var.isShowing()) {
            xm0Var.m0.d(true);
        }
    }
}
