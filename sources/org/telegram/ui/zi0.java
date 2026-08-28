package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zi0 extends kh.d {
    public final /* synthetic */ bj0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true);
        this.d0 = bj0Var;
    }

    @Override // kh.d
    public final float a(float f10, float f11) {
        bj0 bj0Var = this.d0;
        boolean z10 = bj0Var.j0 == 0.0f;
        bj0Var.j0 = f10;
        if (z10) {
            bj0Var.k0 = new bg.z2(bj0Var, 2);
            bj0Var.R(false);
        }
        return f10;
    }
}
