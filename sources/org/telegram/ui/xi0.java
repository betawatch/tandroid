package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xi0 extends nh.d {
    public final /* synthetic */ zi0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = zi0Var;
    }

    @Override // nh.d
    public final float a(float f9, float f10) {
        zi0 zi0Var = this.d0;
        boolean z10 = zi0Var.j0 == 0.0f;
        zi0Var.j0 = f9;
        if (z10) {
            zi0Var.k0 = new eg.p2(zi0Var, 2);
            zi0Var.S(false);
        }
        return f9;
    }
}
