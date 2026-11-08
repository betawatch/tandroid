package org.telegram.ui;

import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class qv extends org.telegram.ui.Components.x9 {
    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.x9
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // org.telegram.ui.Components.x9, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
