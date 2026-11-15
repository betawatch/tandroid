package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yl0 extends org.telegram.ui.Cells.z9 {
    public final /* synthetic */ int I = 1;

    public /* synthetic */ yl0(Context context, org.telegram.ui.ActionBar.o4 o4Var, int i7) {
        super(context, o4Var, i7);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    bg.t0.a(canvas, this, new r3(this, 17));
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

    public /* synthetic */ yl0(Context context, org.telegram.ui.ActionBar.o4 o4Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, o4Var, i7, j3, e6Var);
    }
}
