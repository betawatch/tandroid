package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qz extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ wz c;

    public qz(wz wzVar) {
        this.c = wzVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        wz wzVar = this.c;
        if (wzVar.f.isEmpty()) {
            return 0;
        }
        return wzVar.f.size() + (!wzVar.O ? 1 : 0);
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 >= this.c.f.size() ? 3 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
            wz wzVar = this.c;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wzVar.f.get(i3);
            t2Var.P = wzVar.q0;
            t2Var.d0(org.telegram.messenger.zi.B0(ziVar.k), ziVar, ziVar.k.date, false, false);
            t2Var.t2 = i3 != b() - 1;
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, t2Var, ziVar, t2Var.getMessage() != null && t2Var.getMessage().f1() == ziVar.f1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        kg.x xVar;
        if (i3 == 0) {
            xVar = new kg.x(2, viewGroup.getContext(), true);
        } else if (i3 != 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
            x3Var.setText(org.telegram.messenger.bd.M0(2131745766, null));
            xVar = x3Var;
        } else {
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(viewGroup.getContext(), null);
            izVar.setIsSingleCell(true);
            izVar.setViewType(1);
            xVar = izVar;
        }
        return k2.p1.p(xVar, xVar, -1, -2);
    }
}
