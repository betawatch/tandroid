package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class w91 extends org.telegram.ui.Components.f61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.r7 a;

    static {
        org.telegram.ui.Components.f61.setup(new w91());
    }

    @Override // org.telegram.ui.Components.f61
    public final void attachedView(org.telegram.ui.Components.im0 im0Var, View view, org.telegram.ui.Components.g61 g61Var) {
        ((org.telegram.ui.Cells.s7) view).l(g61Var != null && g61Var.h, false);
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) g61Var.G, g61Var.v, false);
        s7Var.i(g61Var.e, false);
        s7Var.l(g61Var.h, false);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.a, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        return g61Var.q == g61Var2.q && g61Var.e == g61Var2.e && g61Var.B == g61Var2.B;
    }
}
