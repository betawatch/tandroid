package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z51 extends x61 {
    public final /* synthetic */ i71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(i71 i71Var, Context context, boolean z10) {
        super(i71Var, context, z10);
        this.E = i71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i71 i71Var = this.E;
        t41 t41Var = i71Var.g0;
        z51 z51Var = i71Var.f0;
        i61 i61Var = i71Var.U;
        if (i61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = t41Var.getX() + z51Var.getX();
            float y3 = t41Var.getY() + z51Var.getY();
            tg.d dVar = (tg.d) i61Var;
            zg.c0 c0Var = (zg.c0) dVar.b;
            zg.b0 b0Var = c0Var.a;
            org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) dVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            gk0Var.getDelegate().n(canvas, rectF, 0.0f, b0Var.getX() + x10, (c0Var.y == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY()) + y3, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.E.U != null) {
                invalidate();
            }
        }
    }
}
