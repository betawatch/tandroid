package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uj0 extends di.d {
    public final /* synthetic */ wj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(wj0 wj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.h0 = wj0Var;
    }

    @Override // di.d
    public final float a(float f7, float f10) {
        wj0 wj0Var = this.h0;
        boolean z10 = wj0Var.n0 == 0.0f;
        wj0Var.n0 = f7;
        if (z10) {
            wj0Var.o0 = new org.telegram.ui.Components.sb0(wj0Var, 1);
            wj0Var.T(false);
        }
        return f7;
    }
}
