package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qx extends org.telegram.ui.Components.tz {
    public final /* synthetic */ ay B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(ay ayVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.B0 = ayVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.n3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
