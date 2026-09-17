package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
