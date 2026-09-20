package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
            uj0Var.o0 = new org.telegram.ui.Components.za0(uj0Var, 1);
            uj0Var.S(false);
        }
        return f7;
    }
}
