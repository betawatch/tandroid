package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ c00 c;

    public wz(c00 c00Var) {
        this.c = c00Var;
    }

    @Override // org.telegram.ui.Components.bk0
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
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) f1Var.a;
            c00 c00Var = this.c;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c00Var.f.get(i7);
            t2Var.P = c00Var.q0;
            t2Var.d0(org.telegram.messenger.fj.B0(fjVar.k), fjVar, fjVar.k.date, false, false);
            t2Var.t2 = i7 != b() - 1;
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, t2Var, fjVar, t2Var.getMessage() != null && t2Var.getMessage().e1() == fjVar.e1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 == 0) {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        } else if (i7 != 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
            x3Var.setText(org.telegram.messenger.gd.M0(2131745561, null));
            a0Var = x3Var;
        } else {
            org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(viewGroup.getContext(), null);
            wzVar.setIsSingleCell(true);
            wzVar.setViewType(1);
            a0Var = wzVar;
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}
