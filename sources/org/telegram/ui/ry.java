package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ry extends sg.b {
    public final /* synthetic */ sy d;

    public ry(sy syVar) {
        this.d = syVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 8 || i3 == 7;
    }

    public final u4.h0 F() {
        return this.d.l1.getAdapter();
    }

    @Override // u4.h0
    public final int b() {
        return this.d.X1.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((vy) this.d.X1.get(i3)).a;
    }

    @Override // u4.h0
    public final void f() {
        F().f();
    }

    @Override // u4.h0
    public final void g(int i3) {
        F().g(i3 + 1);
    }

    @Override // u4.h0
    public final void j(int i3, int i10) {
        F().j(i3 + 1, i10);
    }

    @Override // u4.h0
    public final void k(int i3, int i10) {
        F().k(i3 + 1, i10);
    }

    @Override // u4.h0
    public final void n(int i3, int i10, Object obj) {
        F().n(i3 + 1, i10, obj);
    }

    @Override // u4.h0
    public final void o(int i3, int i10) {
        F().o(i3 + 1, i10);
    }

    @Override // u4.h0
    public final void p(int i3, int i10) {
        F().p(i3 + 1, i10);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.d.X1;
        vy vyVar = (vy) arrayList.get(i3);
        int i12 = i3 + 1;
        boolean z10 = (i12 >= arrayList.size() || (i10 = ((vy) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((yy) view).e(vyVar.m, z10);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i11 == 6) {
                y8Var.setFixedSize(0);
                y8Var.setText(vyVar.d);
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            oy oyVar = (oy) view;
            oyVar.a.setText(org.telegram.messenger.bd.M0(2131751715, null));
            if (oyVar.c != z10) {
                oyVar.c = z10;
                oyVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        sy syVar = this.d;
        if (i3 == 8) {
            y8Var = new oy(syVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, y8Var, null);
        } else if (i3 == 7) {
            y8Var = new qy(this, syVar.getContext(), syVar.a, syVar.R1.a);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, y8Var, null);
        } else if (i3 == 6 || i3 == 3) {
            y8Var = new org.telegram.ui.Cells.y8(syVar.getContext());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, null);
        } else {
            y8Var = new l0(syVar, syVar.getContext());
        }
        return new org.telegram.ui.Components.bj0(y8Var);
    }
}
