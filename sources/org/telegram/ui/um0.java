package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class um0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.xj0 {
    public final /* synthetic */ zm0 a;

    public /* synthetic */ um0(zm0 zm0Var) {
        this.a = zm0Var;
    }

    @Override // org.telegram.ui.Components.xj0
    public void a(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        zm0 zm0Var = this.a;
        zm0Var.X = z10 ? 1 : 0;
        if (z10) {
            o4Var = ((org.telegram.ui.ActionBar.e2) zm0Var).parentLayout;
            o4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zm0Var.L.d1(true);
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
        zm0 zm0Var = this.a;
        org.telegram.messenger.ve veVar = zm0Var.K;
        return zm0Var.b.containsKey(veVar != null ? Integer.valueOf(((org.telegram.messenger.ff) veVar.e.get(i7)).C) : ((org.telegram.messenger.jf) zm0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        zm0 zm0Var = this.a;
        zm0Var.R.setText(org.telegram.messenger.hd.M0(zm0Var.Z ? 2131745346 : 2131745345, null));
        zm0Var.R.setIcon(zm0Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void i() {
    }
}
