package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ua1 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.q7 a;

    static {
        org.telegram.ui.Components.g51.setup(new ua1());
    }

    @Override // org.telegram.ui.Components.g51
    public final void attachedView(org.telegram.ui.Components.sl0 sl0Var, View view, org.telegram.ui.Components.h51 h51Var) {
        ((org.telegram.ui.Cells.r7) view).l(h51Var.h, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) h51Var.G, h51Var.v, false);
        r7Var.i(h51Var.e, false);
        r7Var.l(h51Var.h, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.q7(context, g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.a, i10);
        r7Var.t0 = true;
        r7Var.a0 = true;
        return r7Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        return h51Var.q == h51Var2.q && h51Var.e == h51Var2.e && h51Var.B == h51Var2.B;
    }
}
