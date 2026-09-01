package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vh1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ ci1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh1(ci1 ci1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ci1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ci1 ci1Var = this.S;
        ci1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ci1Var.V.getMeasuredWidth()};
    }
}
