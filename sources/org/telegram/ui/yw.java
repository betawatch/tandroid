package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yw extends jh.p {
    public final /* synthetic */ gy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(gy gyVar, Context context, gy gyVar2, int i10, int i11) {
        super(context, gyVar2, i10, i11);
        this.K0 = gyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.K0).actionBar;
        return !kVar.t() && super.dispatchTouchEvent(motionEvent);
    }
}
