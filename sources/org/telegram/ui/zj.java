package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zj extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ xn h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(Context context, org.telegram.ui.ActionBar.f6 f6Var, xn xnVar) {
        super(context, f6Var, false);
        this.h2 = xnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        xn xnVar = this.h2;
        if (xnVar.y8 != null) {
            return;
        }
        float y10 = ((xnVar.u0.getY() + xnVar.p9) - getY()) - AndroidUtilities.dp(4.0f);
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
        xn xnVar = this.h2;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.s() || xnVar.A9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        xn xnVar = this.h2;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.s() || xnVar.A9()) {
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
