package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zi0 extends ei.d {
    public final /* synthetic */ bj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = bj0Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        bj0 bj0Var = this.h0;
        boolean z10 = bj0Var.n0 == 0.0f;
        bj0Var.n0 = f7;
        if (z10) {
            bj0Var.o0 = new org.telegram.ui.Components.mb0(bj0Var, 1);
            bj0Var.T(false);
        }
        return f7;
    }
}
