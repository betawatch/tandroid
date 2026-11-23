package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vz extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ b00 c;

    public vz(b00 b00Var) {
        this.c = b00Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        b00 b00Var = this.c;
        if (b00Var.f.isEmpty()) {
            return 0;
        }
        return b00Var.f.size() + (!b00Var.O ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 >= this.c.f.size() ? 3 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.a;
            b00 b00Var = this.c;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) b00Var.f.get(i7);
            u2Var.P = b00Var.q0;
            u2Var.f0(org.telegram.messenger.fj.B0(fjVar.k), fjVar, fjVar.k.date, false, false);
            u2Var.t2 = i7 != b() - 1;
            u2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, u2Var, fjVar, u2Var.getMessage() != null && u2Var.getMessage().e1() == fjVar.e1(), 1));
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
            y3Var.setText(org.telegram.messenger.gd.N0(2131745560, null));
            a0Var = y3Var;
        } else {
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(viewGroup.getContext(), null);
            vzVar.setIsSingleCell(true);
            vzVar.setViewType(1);
            a0Var = vzVar;
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}
