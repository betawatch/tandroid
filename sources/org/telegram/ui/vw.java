package org.telegram.ui;

import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vw extends org.telegram.ui.Components.r9 {
    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.r9
    public final int z1() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
