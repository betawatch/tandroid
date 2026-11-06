package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class yb1 extends org.telegram.ui.Components.voip.z0 {
    public final /* synthetic */ ec1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(ec1 ec1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = ec1Var;
    }

    @Override // org.telegram.ui.Components.voip.z0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ec1 ec1Var = this.V;
        ec1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ec1Var.Y.getMeasuredWidth()};
    }
}
