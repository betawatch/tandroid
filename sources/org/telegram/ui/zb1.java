package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
