package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tc1 extends di.i8 {
    public tc1(Activity activity) {
        super(activity, 3);
    }

    @Override // di.i8, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
