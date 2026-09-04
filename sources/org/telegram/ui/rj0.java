package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class rj0 extends di.d {
    public final /* synthetic */ tj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = tj0Var;
    }

    @Override // di.d
    public final float a(float f7, float f10) {
        tj0 tj0Var = this.h0;
        boolean z10 = tj0Var.n0 == 0.0f;
        tj0Var.n0 = f7;
        if (z10) {
            tj0Var.o0 = new org.telegram.ui.Components.sa0(tj0Var, 1);
            tj0Var.S(false);
        }
        return f7;
    }
}
