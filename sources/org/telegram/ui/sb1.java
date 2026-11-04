package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sb1 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ zb1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(zb1 zb1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = zb1Var;
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zb1 zb1Var = this.W;
        zb1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zb1Var.Z.getMeasuredWidth()};
    }
}
