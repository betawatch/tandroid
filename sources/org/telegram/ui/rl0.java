package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rl0 extends org.telegram.ui.Cells.z9 {
    public final /* synthetic */ int I = 1;

    public /* synthetic */ rl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3) {
        super(context, q4Var, i3);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    cg.t0.a(canvas, this, new s3(this, 16));
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
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ rl0(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, q4Var, i3, j10, e6Var);
    }
}
