package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qj0 extends ci.d {
    public final /* synthetic */ sj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, true);
        this.h0 = sj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        sj0 sj0Var = this.h0;
        boolean z10 = sj0Var.n0 == 0.0f;
        sj0Var.n0 = f7;
        if (z10) {
            sj0Var.o0 = new org.telegram.ui.Components.tb0(sj0Var, 1);
            sj0Var.T(false);
        }
        return f7;
    }
}
