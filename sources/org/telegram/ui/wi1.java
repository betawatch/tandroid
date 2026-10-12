package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wi1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ dj1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi1(dj1 dj1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = dj1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        dj1 dj1Var = this.V;
        dj1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], dj1Var.Y.getMeasuredWidth()};
    }
}
