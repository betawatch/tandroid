package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.sj0 {
    public final /* synthetic */ xm0 a;

    public /* synthetic */ sm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        xm0 xm0Var = this.a;
        xm0Var.W = z9 ? 1 : 0;
        if (z9) {
            q4Var = ((org.telegram.ui.ActionBar.f2) xm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        xm0Var.K.d1(true);
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
        xm0 xm0Var = this.a;
        org.telegram.messenger.we weVar = xm0Var.J;
        return xm0Var.b.containsKey(weVar != null ? Integer.valueOf(((org.telegram.messenger.gf) weVar.e.get(i7)).C) : ((org.telegram.messenger.kf) xm0Var.f.get(i7)).B);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void n() {
        xm0 xm0Var = this.a;
        xm0Var.Q.setText(org.telegram.messenger.hd.M0(xm0Var.Y ? 2131745347 : 2131745346, null));
        xm0Var.Q.setIcon(xm0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
    }
}
