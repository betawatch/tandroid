package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class za1 extends org.telegram.ui.Components.u51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.u51.setup(new za1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void attachedView(org.telegram.ui.Components.wl0 wl0Var, View view, org.telegram.ui.Components.v51 v51Var) {
        ((org.telegram.ui.Cells.t7) view).l(v51Var.h, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) v51Var.G, v51Var.v, false);
        t7Var.i(v51Var.e, false);
        t7Var.l(v51Var.h, false);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        return v51Var.q == v51Var2.q && v51Var.e == v51Var2.e && v51Var.B == v51Var2.B;
    }
}
