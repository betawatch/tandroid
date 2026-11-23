package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zb1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ fc1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(fc1 fc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = fc1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        fc1 fc1Var = this.W;
        fc1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], fc1Var.Z.getMeasuredWidth()};
    }
}
