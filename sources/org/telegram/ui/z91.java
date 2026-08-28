package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z91 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.q7 a;

    static {
        org.telegram.ui.Components.k41.setup(new z91());
    }

    @Override // org.telegram.ui.Components.k41
    public final void attachedView(org.telegram.ui.Components.wk0 wk0Var, View view, org.telegram.ui.Components.l41 l41Var) {
        ((org.telegram.ui.Cells.r7) view).l(l41Var.h, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) l41Var.G, l41Var.v, false);
        r7Var.i(l41Var.e, false);
        r7Var.l(l41Var.h, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.q7(context, b6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.a, i9);
        r7Var.s0 = true;
        r7Var.W = true;
        return r7Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.q == l41Var2.q && l41Var.e == l41Var2.e && l41Var.B == l41Var2.B;
    }
}
