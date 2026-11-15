package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.xj0 {
    public final /* synthetic */ ym0 a;

    public /* synthetic */ tm0(ym0 ym0Var) {
        this.a = ym0Var;
    }

    @Override // org.telegram.ui.Components.xj0
    public void a(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        ym0 ym0Var = this.a;
        ym0Var.X = z10 ? 1 : 0;
        if (z10) {
            o4Var = ((org.telegram.ui.ActionBar.e2) ym0Var).parentLayout;
            o4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        ym0Var.L.d1(true);
    }

    @Override // org.telegram.ui.Components.xj0
    public boolean b(int i7) {
        return this.a.M.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public void d(View view, boolean z10) {
        if (z10 == this.a.Y && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.xj0
    public boolean g(int i7) {
        ym0 ym0Var = this.a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        return ym0Var.b.containsKey(veVar != null ? Integer.valueOf(((org.telegram.messenger.ff) veVar.e.get(i7)).C) : ((org.telegram.messenger.jf) ym0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        ym0 ym0Var = this.a;
        ym0Var.R.setText(org.telegram.messenger.hd.M0(ym0Var.Z ? 2131745346 : 2131745345, null));
        ym0Var.R.setIcon(ym0Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void i() {
    }
}
