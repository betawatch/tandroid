package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.fk0 {
    public final /* synthetic */ cn0 a;

    public /* synthetic */ xm0(cn0 cn0Var) {
        this.a = cn0Var;
    }

    @Override // org.telegram.ui.Components.fk0
    public void e(boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        cn0 cn0Var = this.a;
        cn0Var.X = z10 ? 1 : 0;
        if (z10) {
            s4Var = ((org.telegram.ui.ActionBar.h2) cn0Var).parentLayout;
            s4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cn0Var.L.d1(true);
    }

    @Override // org.telegram.ui.Components.fk0
    public boolean f(int i7) {
        return this.a.M.d(i7) == 0;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k() {
        cn0 cn0Var = this.a;
        cn0Var.R.setText(org.telegram.messenger.gd.M0(cn0Var.Z ? 2131745151 : 2131745150, null));
        cn0Var.R.setIcon(cn0Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.Components.fk0
    public void l(View view, boolean z10) {
        if (z10 == this.a.Y && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.y.e(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public boolean m(int i7) {
        cn0 cn0Var = this.a;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        return cn0Var.b.containsKey(ueVar != null ? Integer.valueOf(((org.telegram.messenger.ef) ueVar.e.get(i7)).C) : ((org.telegram.messenger.hf) cn0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void j() {
    }
}
