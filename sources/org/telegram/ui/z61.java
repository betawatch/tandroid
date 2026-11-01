package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z61 extends org.telegram.ui.Components.a51 {
    public static final /* synthetic */ int c = 0;
    public m.p3 b;

    static {
        org.telegram.ui.Components.a51.h(new z61());
    }

    @Override // org.telegram.ui.Components.a51
    public final void a(org.telegram.ui.Components.uk0 uk0Var, View view, org.telegram.ui.Components.b51 b51Var) {
        ((org.telegram.ui.Cells.s7) view).l(b51Var != null && b51Var.h, false);
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((org.telegram.messenger.kj) b51Var.G, b51Var.v, false);
        s7Var.i(b51Var.e, false);
        s7Var.l(b51Var.h, false);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        if (this.b == null) {
            this.b = new m.p3(context, p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.b, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        return b51Var.q == b51Var2.q && b51Var.e == b51Var2.e && b51Var.B == b51Var2.B;
    }
}
