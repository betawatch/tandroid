package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sd1 extends org.telegram.ui.Components.voip.m0 {
    public final /* synthetic */ zd1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd1(zd1 zd1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = zd1Var;
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zd1 zd1Var = this.V;
        zd1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zd1Var.Y.getMeasuredWidth()};
    }
}
