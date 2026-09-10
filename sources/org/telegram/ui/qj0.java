package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qj0 extends bi.d {
    public final /* synthetic */ sj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = sj0Var;
    }

    @Override // bi.d
    public final float a(float f7, float f10) {
        sj0 sj0Var = this.h0;
        boolean z10 = sj0Var.n0 == 0.0f;
        sj0Var.n0 = f7;
        if (z10) {
            sj0Var.o0 = new org.telegram.ui.Components.bb0(sj0Var, 1);
            sj0Var.S(false);
        }
        return f7;
    }
}
