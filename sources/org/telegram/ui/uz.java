package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uz extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ a00 c;

    public uz(a00 a00Var) {
        this.c = a00Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        a00 a00Var = this.c;
        if (a00Var.f.isEmpty()) {
            return 0;
        }
        return a00Var.f.size() + (!a00Var.N ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 >= this.c.f.size() ? 3 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
            a00 a00Var = this.c;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) a00Var.f.get(i7);
            t2Var.O = a00Var.p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar.k), ijVar, ijVar.k.date, false, false);
            t2Var.s2 = i7 != b() - 1;
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, t2Var, ijVar, t2Var.getMessage() != null && t2Var.getMessage().e1() == ijVar.e1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 == 0) {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        } else if (i7 != 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
            x3Var.setText(org.telegram.messenger.id.M0(2131745756, null));
            a0Var = x3Var;
        } else {
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(viewGroup.getContext(), null);
            mzVar.setIsSingleCell(true);
            mzVar.setViewType(1);
            a0Var = mzVar;
        }
        return jg.g.r(a0Var, a0Var, -1, -2);
    }
}
