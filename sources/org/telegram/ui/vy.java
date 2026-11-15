package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vy extends rg.b {
    public final /* synthetic */ wy d;

    public vy(wy wyVar) {
        this.d = wyVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 8 || i7 == 7;
    }

    public final v4.h0 F() {
        return this.d.o1.getAdapter();
    }

    @Override // v4.h0
    public final int b() {
        return this.d.a2.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((zy) this.d.a2.get(i7)).a;
    }

    @Override // v4.h0
    public final void f() {
        F().f();
    }

    @Override // v4.h0
    public final void g(int i7) {
        F().g(i7 + 1);
    }

    @Override // v4.h0
    public final void j(int i7, int i10) {
        F().j(i7 + 1, i10);
    }

    @Override // v4.h0
    public final void k(int i7, int i10) {
        F().k(i7 + 1, i10);
    }

    @Override // v4.h0
    public final void n(int i7, int i10, Object obj) {
        F().n(i7 + 1, i10, obj);
    }

    @Override // v4.h0
    public final void o(int i7, int i10) {
        F().o(i7 + 1, i10);
    }

    @Override // v4.h0
    public final void p(int i7, int i10) {
        F().p(i7 + 1, i10);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.d.a2;
        zy zyVar = (zy) arrayList.get(i7);
        int i12 = i7 + 1;
        boolean z10 = (i12 >= arrayList.size() || (i10 = ((zy) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((bz) view).e(zyVar.m, z10);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i11 == 6) {
                y8Var.setFixedSize(0);
                y8Var.setText(zyVar.d);
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            sy syVar = (sy) view;
            syVar.a.setText(org.telegram.messenger.hd.M0(2131751714, null));
            if (syVar.c != z10) {
                syVar.c = z10;
                syVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View y8Var;
        wy wyVar = this.d;
        if (i7 == 8) {
            y8Var = new sy(wyVar.getContext());
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, y8Var, null);
        } else if (i7 == 7) {
            y8Var = new uy(this, wyVar.getContext(), wyVar.a, wyVar.U1.a);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, y8Var, null);
        } else if (i7 == 6 || i7 == 3) {
            y8Var = new org.telegram.ui.Cells.y8(wyVar.getContext());
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, y8Var, null);
        } else {
            y8Var = new k0(wyVar, wyVar.getContext());
        }
        return new org.telegram.ui.Components.cj0(y8Var);
    }
}
