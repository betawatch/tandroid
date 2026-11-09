package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wy extends rg.b {
    public final /* synthetic */ xy d;

    public wy(xy xyVar) {
        this.d = xyVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 8 || i7 == 7;
    }

    public final v4.g0 F() {
        return this.d.k1.getAdapter();
    }

    @Override // v4.g0
    public final int b() {
        return this.d.W1.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((az) this.d.W1.get(i7)).a;
    }

    @Override // v4.g0
    public final void f() {
        F().f();
    }

    @Override // v4.g0
    public final void g(int i7) {
        F().g(i7 + 1);
    }

    @Override // v4.g0
    public final void j(int i7, int i10) {
        F().j(i7 + 1, i10);
    }

    @Override // v4.g0
    public final void k(int i7, int i10) {
        F().k(i7 + 1, i10);
    }

    @Override // v4.g0
    public final void n(int i7, int i10, Object obj) {
        F().n(i7 + 1, i10, obj);
    }

    @Override // v4.g0
    public final void o(int i7, int i10) {
        F().o(i7 + 1, i10);
    }

    @Override // v4.g0
    public final void p(int i7, int i10) {
        F().p(i7 + 1, i10);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.d.W1;
        az azVar = (az) arrayList.get(i7);
        int i12 = i7 + 1;
        boolean z9 = (i12 >= arrayList.size() || (i10 = ((az) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((cz) view).e(azVar.m, z9);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(azVar.d);
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            ty tyVar = (ty) view;
            tyVar.a.setText(org.telegram.messenger.id.M0(2131751714, null));
            if (tyVar.c != z9) {
                tyVar.c = z9;
                tyVar.setWillNotDraw(!z9);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        xy xyVar = this.d;
        if (i7 == 8) {
            z8Var = new ty(xyVar.getContext());
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new vy(this, xyVar.getContext(), xyVar.a, xyVar.Q1.a);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, z8Var, null);
        } else if (i7 == 6 || i7 == 3) {
            z8Var = new org.telegram.ui.Cells.z8(xyVar.getContext());
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.a7, z8Var, null);
        } else {
            z8Var = new k0(xyVar, xyVar.getContext());
        }
        return new org.telegram.ui.Components.yi0(z8Var);
    }
}
