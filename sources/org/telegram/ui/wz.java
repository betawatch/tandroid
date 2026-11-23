package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ c00 c;

    public wz(c00 c00Var) {
        this.c = c00Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        c00 c00Var = this.c;
        if (c00Var.f.isEmpty()) {
            return 0;
        }
        return c00Var.f.size() + (!c00Var.O ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 >= this.c.f.size() ? 3 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.a;
            c00 c00Var = this.c;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c00Var.f.get(i7);
            u2Var.P = c00Var.q0;
            u2Var.d0(org.telegram.messenger.gj.B0(gjVar.k), gjVar, gjVar.k.date, false, false);
            u2Var.t2 = i7 != b() - 1;
            u2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, u2Var, gjVar, u2Var.getMessage() != null && u2Var.getMessage().e1() == gjVar.e1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 == 0) {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        } else if (i7 != 3) {
            org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
            y3Var.setText(org.telegram.messenger.hd.N0(2131745560, null));
            a0Var = y3Var;
        } else {
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(viewGroup.getContext(), null);
            yzVar.setIsSingleCell(true);
            yzVar.setViewType(1);
            a0Var = yzVar;
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}
