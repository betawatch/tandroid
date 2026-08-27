package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x91 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.n7 a;

    static {
        org.telegram.ui.Components.m41.setup(new x91());
    }

    @Override // org.telegram.ui.Components.m41
    public final void attachedView(org.telegram.ui.Components.zk0 zk0Var, View view, org.telegram.ui.Components.n41 n41Var) {
        ((org.telegram.ui.Cells.o7) view).l(n41Var.h, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((MessageObject) n41Var.G, n41Var.v, false);
        o7Var.i(n41Var.e, false);
        o7Var.l(n41Var.h, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.n7(context, c6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.a, i10);
        o7Var.s0 = true;
        o7Var.W = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.q == n41Var2.q && n41Var.e == n41Var2.e && n41Var.B == n41Var2.B;
    }
}
