package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yb1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ ec1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(ec1 ec1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = ec1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ec1 ec1Var = this.W;
        ec1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ec1Var.Z.getMeasuredWidth()};
    }
}
