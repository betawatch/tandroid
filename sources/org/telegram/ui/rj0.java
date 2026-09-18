package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rj0 extends ci.d {
    public final /* synthetic */ tj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = tj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        tj0 tj0Var = this.h0;
        boolean z10 = tj0Var.n0 == 0.0f;
        tj0Var.n0 = f7;
        if (z10) {
            tj0Var.o0 = new org.telegram.ui.Components.ra0(tj0Var, 1);
            tj0Var.S(false);
        }
        return f7;
    }
}
