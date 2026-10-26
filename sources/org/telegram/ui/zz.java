package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zz extends qg.b {
    public final /* synthetic */ b00 d;

    public zz(b00 b00Var) {
        this.d = b00Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.h0 F() {
        return this.d.d.getAdapter();
    }

    @Override // s4.h0
    public final int h() {
        return this.d.e0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((f00) this.d.e0.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        F().l();
    }

    @Override // s4.h0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // s4.h0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // s4.h0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.d.e0;
        f00 f00Var = (f00) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((f00) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((h00) view).e(f00Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i12 == 6) {
                i9Var.setFixedSize(0);
                i9Var.setText(f00Var.d);
                return;
            } else {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            wz wzVar = (wz) view;
            wzVar.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (wzVar.c != z10) {
                wzVar.c = z10;
                wzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View i9Var;
        int i11;
        b00 b00Var = this.d;
        if (i10 == 8) {
            i9Var = new wz(b00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, i9Var, null);
        } else if (i10 == 7) {
            Context context = b00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.k3) b00Var).currentAccount;
            i9Var = new yz(this, context, i11, b00Var.Y.id);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, i9Var, null);
        } else if (i10 == 6 || i10 == 3) {
            i9Var = new org.telegram.ui.Cells.i9(b00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, i9Var, null);
        } else {
            i9Var = new a00(b00Var, b00Var.getContext());
        }
        return new org.telegram.ui.Components.vl0(i9Var);
    }
}
