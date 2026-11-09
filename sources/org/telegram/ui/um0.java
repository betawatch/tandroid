package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class um0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.tj0 {
    public final /* synthetic */ zm0 a;

    public /* synthetic */ um0(zm0 zm0Var) {
        this.a = zm0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        zm0 zm0Var = this.a;
        zm0Var.W = z9 ? 1 : 0;
        if (z9) {
            q4Var = ((org.telegram.ui.ActionBar.f2) zm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zm0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean e(int i7) {
        return this.a.L.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.tj0
    public void j(View view, boolean z9) {
        if (z9 == this.a.X && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean k(int i7) {
        zm0 zm0Var = this.a;
        org.telegram.messenger.we weVar = zm0Var.J;
        return zm0Var.b.containsKey(weVar != null ? Integer.valueOf(((org.telegram.messenger.gf) weVar.e.get(i7)).C) : ((org.telegram.messenger.kf) zm0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void n() {
        zm0 zm0Var = this.a;
        zm0Var.Q.setText(org.telegram.messenger.id.M0(zm0Var.Y ? 2131745346 : 2131745345, null));
        zm0Var.Q.setIcon(zm0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
    }
}
