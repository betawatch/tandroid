package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class sz extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ yz c;

    public sz(yz yzVar) {
        this.c = yzVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        yz yzVar = this.c;
        if (yzVar.f.isEmpty()) {
            return 0;
        }
        return yzVar.f.size() + (!yzVar.N ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 >= this.c.f.size() ? 3 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) d1Var.a;
            yz yzVar = this.c;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) yzVar.f.get(i7);
            t2Var.O = yzVar.p0;
            t2Var.d0(org.telegram.messenger.ij.B0(ijVar.k), ijVar, ijVar.k.date, false, false);
            t2Var.s2 = i7 != b() - 1;
            t2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, t2Var, ijVar, t2Var.getMessage() != null && t2Var.getMessage().f1() == ijVar.f1(), 1));
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
            x3Var.setText(org.telegram.messenger.hd.M0(2131745757, null));
            a0Var = x3Var;
        } else {
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(viewGroup.getContext(), null);
            lzVar.setIsSingleCell(true);
            lzVar.setViewType(1);
            a0Var = lzVar;
        }
        return jg.g.r(a0Var, a0Var, -1, -2);
    }
}
