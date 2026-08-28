package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yz extends wf.b {
    public final /* synthetic */ a00 d;

    public yz(a00 a00Var) {
        this.d = a00Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 8 || i9 == 7;
    }

    public final f2.r0 F() {
        return this.d.d.getAdapter();
    }

    @Override // f2.r0
    public final int h() {
        return this.d.Z.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((e00) this.d.Z.get(i9)).a;
    }

    @Override // f2.r0
    public final void l() {
        F().l();
    }

    @Override // f2.r0
    public final void m(int i9) {
        F().m(i9 + 1);
    }

    @Override // f2.r0
    public final void p(int i9, int i10) {
        F().p(i9 + 1, i10);
    }

    @Override // f2.r0
    public final void q(int i9, int i10) {
        F().q(i9 + 1, i10);
    }

    @Override // f2.r0
    public final void r(int i9, int i10, Object obj) {
        F().r(i9 + 1, i10, obj);
    }

    @Override // f2.r0
    public final void s(int i9, int i10) {
        F().s(i9 + 1, i10);
    }

    @Override // f2.r0
    public final void t(int i9, int i10) {
        F().t(i9 + 1, i10);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11 = q1Var.f;
        View view = q1Var.a;
        ArrayList arrayList = this.d.Z;
        e00 e00Var = (e00) arrayList.get(i9);
        int i12 = i9 + 1;
        boolean z10 = (i12 >= arrayList.size() || (i10 = ((e00) arrayList.get(i12)).a) == 3 || i10 == 6) ? false : true;
        if (i11 == 7) {
            ((g00) view).e(e00Var.m, z10);
            return;
        }
        if (i11 == 6 || i11 == 3) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i11 == 6) {
                b9Var.setFixedSize(0);
                b9Var.setText(e00Var.d);
                return;
            } else {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
        }
        if (i11 != 0 && i11 == 8) {
            vz vzVar = (vz) view;
            vzVar.a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
            if (vzVar.c != z10) {
                vzVar.c = z10;
                vzVar.setWillNotDraw(!z10);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View b9Var;
        int i10;
        a00 a00Var = this.d;
        if (i9 == 8) {
            b9Var = new vz(a00Var.getContext());
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        } else if (i9 == 7) {
            Context context = a00Var.getContext();
            i10 = ((org.telegram.ui.ActionBar.f3) a00Var).currentAccount;
            b9Var = new xz(this, context, i10, a00Var.T.id);
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        } else if (i9 == 6 || i9 == 3) {
            b9Var = new org.telegram.ui.Cells.b9(a00Var.getContext());
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        } else {
            b9Var = new zz(a00Var, a00Var.getContext());
        }
        return new org.telegram.ui.Components.ik0(b9Var);
    }
}
