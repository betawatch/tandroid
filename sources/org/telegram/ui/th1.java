package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class th1 extends org.telegram.ui.Components.voip.a1 {
    public final /* synthetic */ ai1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th1(ai1 ai1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ai1Var;
    }

    @Override // org.telegram.ui.Components.voip.a1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ai1 ai1Var = this.S;
        ai1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ai1Var.V.getMeasuredWidth()};
    }
}
