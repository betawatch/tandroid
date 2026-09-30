package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class za1 extends org.telegram.ui.Components.w51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.w51.setup(new za1());
    }

    @Override // org.telegram.ui.Components.w51
    public final void attachedView(org.telegram.ui.Components.yl0 yl0Var, View view, org.telegram.ui.Components.x51 x51Var) {
        ((org.telegram.ui.Cells.t7) view).l(x51Var.h, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) x51Var.G, x51Var.v, false);
        t7Var.i(x51Var.e, false);
        t7Var.l(x51Var.h, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        return x51Var.q == x51Var2.q && x51Var.e == x51Var2.e && x51Var.B == x51Var2.B;
    }
}
