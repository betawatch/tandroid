package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ya1 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.g51.setup(new ya1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void attachedView(org.telegram.ui.Components.ml0 ml0Var, View view, org.telegram.ui.Components.h51 h51Var) {
        ((org.telegram.ui.Cells.t7) view).l(h51Var.h, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) h51Var.G, h51Var.v, false);
        t7Var.i(h51Var.e, false);
        t7Var.l(h51Var.h, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        return h51Var.q == h51Var2.q && h51Var.e == h51Var2.e && h51Var.B == h51Var2.B;
    }
}
