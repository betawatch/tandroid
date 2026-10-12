package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vj0 extends di.d {
    public final /* synthetic */ xj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(xj0 xj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.h0 = xj0Var;
    }

    @Override // di.d
    public final float a(float f7, float f10) {
        xj0 xj0Var = this.h0;
        boolean z10 = xj0Var.n0 == 0.0f;
        xj0Var.n0 = f7;
        if (z10) {
            xj0Var.o0 = new org.telegram.ui.Components.sb0(xj0Var, 1);
            xj0Var.T(false);
        }
        return f7;
    }
}
