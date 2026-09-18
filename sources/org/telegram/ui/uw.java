package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.Components.k00 {
    public final /* synthetic */ wy B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(wy wyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.B0 = wyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
