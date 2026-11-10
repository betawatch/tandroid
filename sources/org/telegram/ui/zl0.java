package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zl0 extends org.telegram.ui.Cells.z9 {
    public final /* synthetic */ int H = 1;

    public /* synthetic */ zl0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        super(context, r4Var, i7);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    bg.u0.a(canvas, this, new r3(this, 17));
                    break;
                } else {
                    super.draw(canvas);
                    break;
                }
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.z9, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ zl0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, r4Var, i7, j3, h6Var);
    }
}
