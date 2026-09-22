package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y51 extends w61 {
    public final /* synthetic */ h71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(h71 h71Var, Context context, boolean z10) {
        super(h71Var, context, z10);
        this.E = h71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h71 h71Var = this.E;
        t51 t51Var = h71Var.g0;
        y51 y51Var = h71Var.f0;
        h61 h61Var = h71Var.U;
        if (h61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = t51Var.getX() + y51Var.getX();
            float y3 = t51Var.getY() + y51Var.getY();
            tg.d dVar = (tg.d) h61Var;
            zg.c0 c0Var = (zg.c0) dVar.b;
            zg.b0 b0Var = c0Var.a;
            org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) dVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            fk0Var.getDelegate().n(canvas, rectF, 0.0f, b0Var.getX() + x10, (c0Var.y == 1 ? b0Var.getY() - AndroidUtilities.statusBarHeight : b0Var.getY() + c0Var.c.getY()) + y3, 255, true);
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
