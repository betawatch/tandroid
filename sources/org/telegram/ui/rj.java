package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rj extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ qn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(Context context, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(context, b6Var, false);
        this.g2 = qnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final void onDraw(Canvas canvas) {
        qn qnVar = this.g2;
        if (qnVar.x8 != null) {
            return;
        }
        float y10 = ((qnVar.t0.getY() + qnVar.o9) - getY()) - AndroidUtilities.dp(4.0f);
        if (y10 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y10 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), getMeasuredHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        qn qnVar = this.g2;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.s() || qnVar.A9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        qn qnVar = this.g2;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar.s() || qnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
