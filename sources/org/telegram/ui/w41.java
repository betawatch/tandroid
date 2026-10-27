package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w41 extends u51 {
    public final /* synthetic */ f61 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(f61 f61Var, Context context, boolean z10) {
        super(f61Var, context, z10);
        this.G = f61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f61 f61Var = this.G;
        r41 r41Var = f61Var.g0;
        w41 w41Var = f61Var.f0;
        f51 f51Var = f61Var.U;
        if (f51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x9 = r41Var.getX() + w41Var.getX();
            float y3 = r41Var.getY() + w41Var.getY();
            ai.f0 f0Var = (ai.f0) f51Var;
            bh.i0 i0Var = (bh.i0) f0Var.b;
            bh.h0 h0Var = i0Var.a;
            org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) f0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            gl0Var.getDelegate().l(canvas, rectF, 0.0f, h0Var.getX() + x9, (i0Var.y == 1 ? h0Var.getY() - AndroidUtilities.statusBarHeight : h0Var.getY() + i0Var.c.getY()) + y3, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.G.U != null) {
                invalidate();
            }
        }
    }
}
