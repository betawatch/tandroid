package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t41 extends r51 {
    public final /* synthetic */ c61 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(c61 c61Var, Context context, boolean z10) {
        super(c61Var, context, z10);
        this.G = c61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c61 c61Var = this.G;
        o41 o41Var = c61Var.g0;
        t41 t41Var = c61Var.f0;
        c51 c51Var = c61Var.U;
        if (c51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x9 = o41Var.getX() + t41Var.getX();
            float y3 = o41Var.getY() + t41Var.getY();
            ai.f0 f0Var = (ai.f0) c51Var;
            bh.i0 i0Var = (bh.i0) f0Var.b;
            bh.h0 h0Var = i0Var.a;
            org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) f0Var.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            fl0Var.getDelegate().l(canvas, rectF, 0.0f, h0Var.getX() + x9, (i0Var.y == 1 ? h0Var.getY() - AndroidUtilities.statusBarHeight : h0Var.getY() + i0Var.c.getY()) + y3, 255, true);
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
