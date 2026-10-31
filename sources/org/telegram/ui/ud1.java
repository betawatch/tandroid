package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ud1 extends org.telegram.ui.Components.voip.l0 {
    public final /* synthetic */ be1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(be1 be1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = be1Var;
    }

    @Override // org.telegram.ui.Components.voip.l0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        be1 be1Var = this.V;
        be1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], be1Var.Y.getMeasuredWidth()};
    }
}
