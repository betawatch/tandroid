package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.sj0 {
    public final /* synthetic */ an0 a;

    public /* synthetic */ vm0(an0 an0Var) {
        this.a = an0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var;
        an0 an0Var = this.a;
        an0Var.W = z9 ? 1 : 0;
        if (z9) {
            r4Var = ((org.telegram.ui.ActionBar.f2) an0Var).parentLayout;
            r4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        an0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean e(int i7) {
        return this.a.L.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.sj0
    public void j(View view, boolean z9) {
        if (z9 == this.a.X && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean k(int i7) {
        an0 an0Var = this.a;
        org.telegram.messenger.we weVar = an0Var.J;
        return an0Var.b.containsKey(weVar != null ? Integer.valueOf(((org.telegram.messenger.gf) weVar.e.get(i7)).C) : ((org.telegram.messenger.kf) an0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void n() {
        an0 an0Var = this.a;
        an0Var.Q.setText(org.telegram.messenger.id.M0(an0Var.Y ? 2131745346 : 2131745345, null));
        an0Var.Q.setIcon(an0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
    }
}
