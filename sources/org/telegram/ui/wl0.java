package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wl0 extends org.telegram.ui.Cells.z9 {
    public final /* synthetic */ int H = 1;

    public /* synthetic */ wl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i7) {
        super(context, q4Var, i7);
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

    public /* synthetic */ wl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, q4Var, i7, j3, f6Var);
    }
}
