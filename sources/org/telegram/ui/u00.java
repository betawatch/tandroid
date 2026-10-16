package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u00 extends pg.b {
    public final /* synthetic */ w00 d;

    public u00(w00 w00Var) {
        this.d = w00Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 8 || i10 == 7;
    }

    public final s4.g0 F() {
        return this.d.d.getAdapter();
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((b10) this.d.d0.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        F().l();
    }

    @Override // s4.g0
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override // s4.g0
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.d.d0;
        b10 b10Var = (b10) arrayList.get(i10);
        int i13 = i10 + 1;
        boolean z10 = (i13 >= arrayList.size() || (i11 = ((b10) arrayList.get(i13)).a) == 3 || i11 == 6) ? false : true;
        if (i12 == 7) {
            ((d10) view).e(b10Var.m, z10);
            return;
        }
        if (i12 == 6 || i12 == 3) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i12 == 6) {
                e9Var.setFixedSize(0);
                e9Var.setText(b10Var.d);
                return;
            } else {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
        }
        if (i12 != 0 && i12 == 8) {
            r00 r00Var = (r00) view;
            r00Var.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (r00Var.c != z10) {
                r00Var.c = z10;
                r00Var.setWillNotDraw(!z10);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e9Var;
        int i11;
        w00 w00Var = this.d;
        if (i10 == 8) {
            e9Var = new r00(w00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else if (i10 == 7) {
            Context context = w00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.e3) w00Var).currentAccount;
            e9Var = new t00(this, context, i11, w00Var.X.id);
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
        } else if (i10 == 6 || i10 == 3) {
            e9Var = new org.telegram.ui.Cells.e9(w00Var.getContext());
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        } else {
            e9Var = new v00(w00Var, w00Var.getContext());
        }
        return new org.telegram.ui.Components.wl0(e9Var);
    }
}
