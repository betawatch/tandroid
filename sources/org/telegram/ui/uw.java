package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uw extends th.m {
    public final /* synthetic */ ay O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(ay ayVar, Context context, ay ayVar2, int i10, int i11) {
        super(context, ayVar2, i10, i11);
        this.O0 = ayVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.O0).actionBar;
        return !lVar.u() && super.dispatchTouchEvent(motionEvent);
    }
}
