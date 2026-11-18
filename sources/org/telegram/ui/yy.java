package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class yy extends rg.b {
    public final /* synthetic */ zy d;

    public yy(zy zyVar) {
        this.d = zyVar;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 8 || i7 == 7;
    }

    public final v4.i0 F() {
        return this.d.o1.getAdapter();
    }

    @Override // v4.i0
    public final int b() {
        return this.d.a2.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((cz) this.d.a2.get(i7)).a;
    }

    @Override // v4.i0
    public final void f() {
        F().f();
    }

    @Override // v4.i0
    public final void g(int i7) {
        F().g(i7 + 1);
    }

    @Override // v4.i0
    public final void j(int i7, int i10) {
        F().j(i7 + 1, i10);
    }

    @Override // v4.i0
    public final void k(int i7, int i10) {
        F().k(i7 + 1, i10);
    }

    @Override // v4.i0
    public final void n(int i7, int i10, Object obj) {
        F().n(i7 + 1, i10, obj);
    }

    @Override // v4.i0
    public final void o(int i7, int i10) {
        F().o(i7 + 1, i10);
    }

    @Override // v4.i0
    public final void p(int i7, int i10) {
        F().p(i7 + 1, i10);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11 = f1Var.f;
        View view = f1Var.a;
        ArrayList arrayList = this.d.a2;
        cz czVar = (cz) arrayList.get(i7);
        int i12 = i7 + 1;
        boolean z10 = (i12 >= arrayList.size() || (i10 = ((cz) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((ez) view).e(czVar.m, z10);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(czVar.d);
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            vy vyVar = (vy) view;
            vyVar.a.setText(org.telegram.messenger.gd.M0(2131751703, null));
            if (vyVar.c != z10) {
                vyVar.c = z10;
                vyVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        zy zyVar = this.d;
        if (i7 == 8) {
            z8Var = new vy(zyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new xy(this, zyVar.getContext(), zyVar.a, zyVar.U1.a);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, z8Var, null);
        } else if (i7 == 6 || i7 == 3) {
            z8Var = new org.telegram.ui.Cells.z8(zyVar.getContext());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, z8Var, null);
        } else {
            z8Var = new k0(zyVar, zyVar.getContext());
        }
        return new org.telegram.ui.Components.kj0(z8Var);
    }
}
