package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.p7 a;

    static {
        org.telegram.ui.Components.h51.setup(new va1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(org.telegram.ui.Components.rl0 rl0Var, View view, org.telegram.ui.Components.i51 i51Var) {
        ((org.telegram.ui.Cells.q7) view).l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
        q7Var.k((MessageObject) i51Var.G, i51Var.v, false);
        q7Var.i(i51Var.e, false);
        q7Var.l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.p7(context, f6Var);
        }
        org.telegram.ui.Cells.q7 q7Var = new org.telegram.ui.Cells.q7(context, this.a, i10);
        q7Var.t0 = true;
        q7Var.a0 = true;
        return q7Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        return i51Var.q == i51Var2.q && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B;
    }
}
