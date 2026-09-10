package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class si1 extends org.telegram.ui.Components.voip.c1 {
    public final /* synthetic */ zi1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si1(zi1 zi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = zi1Var;
    }

    @Override // org.telegram.ui.Components.voip.c1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        zi1 zi1Var = this.V;
        zi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], zi1Var.Y.getMeasuredWidth()};
    }
}
