package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rx extends org.telegram.ui.Components.m20 {
    public rx(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
