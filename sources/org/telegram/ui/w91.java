package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class w91 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.r7 a;

    static {
        org.telegram.ui.Components.g61.setup(new w91());
    }

    @Override // org.telegram.ui.Components.g61
    public final void attachedView(org.telegram.ui.Components.jm0 jm0Var, View view, org.telegram.ui.Components.h61 h61Var) {
        ((org.telegram.ui.Cells.s7) view).l(h61Var != null && h61Var.h, false);
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) h61Var.G, h61Var.v, false);
        s7Var.i(h61Var.e, false);
        s7Var.l(h61Var.h, false);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.r7(context, d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.a, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        return h61Var.q == h61Var2.q && h61Var.e == h61Var2.e && h61Var.B == h61Var2.B;
    }
}
