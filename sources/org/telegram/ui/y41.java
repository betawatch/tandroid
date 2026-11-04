package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y41 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int c = 0;
    public m.o3 b;

    static {
        org.telegram.ui.Components.q31.h(new y41());
    }

    @Override // org.telegram.ui.Components.q31
    public final void a(org.telegram.ui.Components.tj0 tj0Var, View view, org.telegram.ui.Components.r31 r31Var) {
        ((org.telegram.ui.Cells.n7) view).l(r31Var != null && r31Var.h, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        n7Var.k((org.telegram.messenger.zi) r31Var.G, r31Var.v, false);
        n7Var.i(r31Var.e, false);
        n7Var.l(r31Var.h, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.b == null) {
            this.b = new m.o3(context, e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.b, i3);
        n7Var.x0 = true;
        n7Var.e0 = true;
        return n7Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        return r31Var.q == r31Var2.q && r31Var.e == r31Var2.e && r31Var.B == r31Var2.B;
    }
}
