package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zb1 extends org.telegram.ui.Components.voip.z0 {
    public final /* synthetic */ fc1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(fc1 fc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = fc1Var;
    }

    @Override // org.telegram.ui.Components.voip.z0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        fc1 fc1Var = this.V;
        fc1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], fc1Var.Y.getMeasuredWidth()};
    }
}
