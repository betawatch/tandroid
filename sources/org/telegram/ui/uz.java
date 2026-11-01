package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class uz extends hg.c {
    public final /* synthetic */ vz d;

    public uz(vz vzVar) {
        this.d = vzVar;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.g0 F() {
        return this.d.k1.getAdapter();
    }

    @Override // s4.g0
    public final int b() {
        return this.d.W1.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((zz) this.d.W1.get(i10)).a;
    }

    @Override // s4.g0
    public final void f() {
        F().f();
    }

    @Override // s4.g0
    public final void g(int i10) {
        F().g(i10 + 1);
    }

    @Override // s4.g0
    public final void j(int i10, int i11) {
        F().j(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void k(int i10, int i11) {
        F().k(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void n(int i10, int i11, Object obj) {
        F().n(i10 + 1, i11, obj);
    }

    @Override // s4.g0
    public final void o(int i10, int i11) {
        F().o(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.d.W1;
        zz zzVar = (zz) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((zz) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((b00) view).e(zzVar.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i12 == 6) {
                b9Var.setFixedSize(0);
                b9Var.setText(zzVar.d);
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            rz rzVar = (rz) view;
            rzVar.a.setText(org.telegram.messenger.dd.L0(2131751715, null));
            if (rzVar.c != z10) {
                rzVar.c = z10;
                rzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        vz vzVar = this.d;
        if (i10 == 8) {
            b9Var = new rz(vzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, b9Var, null);
        } else if (i10 == 7) {
            b9Var = new tz(this, vzVar.getContext(), vzVar.a, vzVar.Q1.a);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, b9Var, null);
        } else if (i10 == 6 || i10 == 3) {
            b9Var = new org.telegram.ui.Cells.b9(vzVar.getContext());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, b9Var, null);
        } else {
            b9Var = new l0(vzVar, vzVar.getContext());
        }
        return new org.telegram.ui.Components.dk0(b9Var);
    }
}
