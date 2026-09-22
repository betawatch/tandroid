package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sj0 extends ci.d {
    public final /* synthetic */ uj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(uj0 uj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.h0 = uj0Var;
    }

    @Override // ci.d
    public final float a(float f7, float f10) {
        uj0 uj0Var = this.h0;
        boolean z10 = uj0Var.n0 == 0.0f;
        uj0Var.n0 = f7;
        if (z10) {
            uj0Var.o0 = new org.telegram.ui.Components.cb0(uj0Var, 1);
            uj0Var.S(false);
        }
        return f7;
    }
}
