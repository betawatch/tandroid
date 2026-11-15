package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tz extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ zz c;

    public tz(zz zzVar) {
        this.c = zzVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        zz zzVar = this.c;
        if (zzVar.f.isEmpty()) {
            return 0;
        }
        return zzVar.f.size() + (!zzVar.O ? 1 : 0);
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 >= this.c.f.size() ? 3 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) e1Var.a;
            zz zzVar = this.c;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) zzVar.f.get(i7);
            t2Var.P = zzVar.q0;
            t2Var.f0(org.telegram.messenger.gj.B0(gjVar.k), gjVar, gjVar.k.date, false, false);
            t2Var.t2 = i7 != b() - 1;
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, t2Var, gjVar, t2Var.getMessage() != null && t2Var.getMessage().e1() == gjVar.e1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var;
        if (i7 == 0) {
            a0Var = new jg.a0(2, viewGroup.getContext(), true);
        } else if (i7 != 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
            x3Var.setText(org.telegram.messenger.hd.M0(2131745756, null));
            a0Var = x3Var;
        } else {
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(viewGroup.getContext(), null);
            pzVar.setIsSingleCell(true);
            pzVar.setViewType(1);
            a0Var = pzVar;
        }
        return i5.c.q(a0Var, a0Var, -1, -2);
    }
}
