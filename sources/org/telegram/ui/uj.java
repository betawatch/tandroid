package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uj extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ tn g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(Context context, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(context, c6Var, false);
        this.g2 = tnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        tn tnVar = this.g2;
        if (tnVar.x8 != null) {
            return;
        }
        float y8 = ((tnVar.t0.getY() + tnVar.o9) - getY()) - AndroidUtilities.dp(4.0f);
        if (y8 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y8 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y8, getMeasuredWidth(), getMeasuredHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        tn tnVar = this.g2;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.s() || tnVar.A9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        tn tnVar = this.g2;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.s() || tnVar.A9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        setVisibility(f9 > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            invalidate();
        }
        super.setTranslationY(f9);
    }
}
