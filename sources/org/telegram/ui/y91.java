package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class y91 extends org.telegram.ui.Components.e61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.r7 a;

    static {
        org.telegram.ui.Components.e61.setup(new y91());
    }

    @Override // org.telegram.ui.Components.e61
    public final void attachedView(org.telegram.ui.Components.im0 im0Var, View view, org.telegram.ui.Components.f61 f61Var) {
        ((org.telegram.ui.Cells.s7) view).l(f61Var != null && f61Var.h, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) f61Var.G, f61Var.v, false);
        s7Var.i(f61Var.e, false);
        s7Var.l(f61Var.h, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.a, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(org.telegram.ui.Components.f61 f61Var, org.telegram.ui.Components.f61 f61Var2) {
        return f61Var.q == f61Var2.q && f61Var.e == f61Var2.e && f61Var.B == f61Var2.B;
    }
}
