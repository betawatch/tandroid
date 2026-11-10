package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xy extends rg.b {
    public final /* synthetic */ yy d;

    public xy(yy yyVar) {
        this.d = yyVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 8 || i7 == 7;
    }

    public final v4.g0 F() {
        return this.d.n1.getAdapter();
    }

    @Override // v4.g0
    public final int b() {
        return this.d.Z1.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((bz) this.d.Z1.get(i7)).a;
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
        ArrayList arrayList = this.d.Z1;
        bz bzVar = (bz) arrayList.get(i7);
        int i12 = i7 + 1;
        boolean z9 = (i12 >= arrayList.size() || (i10 = ((bz) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((dz) view).e(bzVar.m, z9);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(bzVar.d);
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            uy uyVar = (uy) view;
            uyVar.a.setText(org.telegram.messenger.id.M0(2131751714, null));
            if (uyVar.c != z9) {
                uyVar.c = z9;
                uyVar.setWillNotDraw(!z9);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        yy yyVar = this.d;
        if (i7 == 8) {
            z8Var = new uy(yyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new wy(this, yyVar.getContext(), yyVar.a, yyVar.T1.a);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, z8Var, null);
        } else if (i7 == 6 || i7 == 3) {
            z8Var = new org.telegram.ui.Cells.z8(yyVar.getContext());
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, z8Var, null);
        } else {
            z8Var = new k0(yyVar, yyVar.getContext());
        }
        return new org.telegram.ui.Components.xi0(z8Var);
    }
}
