package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.hk0 {
    public final /* synthetic */ an0 a;

    public /* synthetic */ vm0(an0 an0Var) {
        this.a = an0Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void d() {
        an0 an0Var = this.a;
        an0Var.R.setText(org.telegram.messenger.gd.N0(an0Var.Z ? 2131745150 : 2131745149, null));
        an0Var.R.setIcon(an0Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.Components.hk0
    public void f(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        an0 an0Var = this.a;
        an0Var.X = z10 ? 1 : 0;
        if (z10) {
            r4Var = ((org.telegram.ui.ActionBar.g2) an0Var).parentLayout;
            r4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        an0Var.L.d1(true);
    }

    @Override // org.telegram.ui.Components.hk0
    public boolean g(int i7) {
        return this.a.M.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.hk0
    public void n(View view, boolean z10) {
        if (z10 == this.a.Y && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.y.d(r5Var);
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public boolean o(int i7) {
        an0 an0Var = this.a;
        org.telegram.messenger.ue ueVar = an0Var.K;
        return an0Var.b.containsKey(ueVar != null ? Integer.valueOf(((org.telegram.messenger.ef) ueVar.e.get(i7)).C) : ((org.telegram.messenger.hf) an0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void a() {
    }
}
