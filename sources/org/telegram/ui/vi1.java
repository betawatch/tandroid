package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vi1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ cj1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi1(cj1 cj1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = cj1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        cj1 cj1Var = this.V;
        cj1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], cj1Var.Y.getMeasuredWidth()};
    }
}
