package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t00 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ z00 c;

    public t00(z00 z00Var) {
        this.c = z00Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        z00 z00Var = this.c;
        if (z00Var.f.isEmpty()) {
            return 0;
        }
        return z00Var.f.size() + (!z00Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) c1Var.a;
            z00 z00Var = this.c;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) z00Var.f.get(i10);
            v2Var.O = z00Var.p0;
            v2Var.d0(org.telegram.messenger.jj.B0(jjVar.k), jjVar, jjVar.k.date, false, false);
            v2Var.s2 = i10 != b() - 1;
            v2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, v2Var, jjVar, v2Var.getMessage() != null && v2Var.getMessage().f1() == jjVar.f1(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.kt0 kt0Var;
        if (i10 == 0) {
            kt0Var = new org.telegram.ui.Components.kt0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
            z3Var.setText(org.telegram.messenger.cd.L0(2131745773, null));
            kt0Var = z3Var;
        } else {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(viewGroup.getContext(), null);
            zzVar.setIsSingleCell(true);
            zzVar.setViewType(1);
            kt0Var = zzVar;
        }
        return sc.e.o(kt0Var, kt0Var, -1, -2);
    }
}
