package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ sn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(Context context, org.telegram.ui.ActionBar.g6 g6Var, sn snVar) {
        super(context, g6Var, false);
        this.t2 = snVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        sn snVar = this.t2;
        if (snVar.N8 != null) {
            return;
        }
        float y3 = ((snVar.x0.getY() + snVar.E9) - getY()) - AndroidUtilities.dp(4.0f);
        if (y3 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y3 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y3, getMeasuredWidth(), getMeasuredHeight());
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
        sn snVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (kVar.s() || snVar.F9()) {
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
        sn snVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (kVar.s() || snVar.F9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
