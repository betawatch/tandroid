package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tj extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ rn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(Context context, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(context, c6Var, false);
        this.g2 = rnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        rn rnVar = this.g2;
        if (rnVar.x8 != null) {
            return;
        }
        float y10 = ((rnVar.t0.getY() + rnVar.o9) - getY()) - AndroidUtilities.dp(4.0f);
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
        rn rnVar = this.g2;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.t() || rnVar.A9()) {
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
        rn rnVar = this.g2;
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.t() || rnVar.A9()) {
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
