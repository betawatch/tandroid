package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s00 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ y00 c;

    public s00(y00 y00Var) {
        this.c = y00Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        y00 y00Var = this.c;
        if (y00Var.f.isEmpty()) {
            return 0;
        }
        return y00Var.f.size() + (!y00Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.a;
            y00 y00Var = this.c;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) y00Var.f.get(i10);
            v2Var.O = y00Var.p0;
            v2Var.d0(org.telegram.messenger.kj.B0(kjVar.k), kjVar, kjVar.k.date, false, false);
            v2Var.s2 = i10 != b() - 1;
            v2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, v2Var, kjVar, v2Var.getMessage() != null && v2Var.getMessage().f1() == kjVar.f1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.lt0 lt0Var;
        if (i10 == 0) {
            lt0Var = new org.telegram.ui.Components.lt0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
            z3Var.setText(org.telegram.messenger.dd.L0(2131745773, null));
            lt0Var = z3Var;
        } else {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setIsSingleCell(true);
            zzVar.setViewType(1);
            lt0Var = zzVar;
        }
        return sc.e.o(lt0Var, lt0Var, -1, -2);
    }
}
