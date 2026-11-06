package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class uy extends rg.b {
    public final /* synthetic */ vy d;

    public uy(vy vyVar) {
        this.d = vyVar;
    }

    @Override // org.telegram.ui.Components.oj0
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
        return ((yy) this.d.W1.get(i7)).a;
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
        yy yyVar = (yy) arrayList.get(i7);
        int i12 = i7 + 1;
        boolean z9 = (i12 >= arrayList.size() || (i10 = ((yy) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((az) view).e(yyVar.m, z9);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i11 == 6) {
                z8Var.setFixedSize(0);
                z8Var.setText(yyVar.d);
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            ry ryVar = (ry) view;
            ryVar.a.setText(org.telegram.messenger.hd.M0(2131751715, null));
            if (ryVar.c != z9) {
                ryVar.c = z9;
                ryVar.setWillNotDraw(!z9);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        vy vyVar = this.d;
        if (i7 == 8) {
            z8Var = new ry(vyVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, z8Var, null);
        } else if (i7 == 7) {
            z8Var = new ty(this, vyVar.getContext(), vyVar.a, vyVar.Q1.a);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, z8Var, null);
        } else if (i7 == 6 || i7 == 3) {
            z8Var = new org.telegram.ui.Cells.z8(vyVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, z8Var, null);
        } else {
            z8Var = new k0(vyVar, vyVar.getContext());
        }
        return new org.telegram.ui.Components.xi0(z8Var);
    }
}
