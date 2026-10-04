package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class t51 extends r61 {
    public final /* synthetic */ c71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(c71 c71Var, Context context, boolean z10) {
        super(c71Var, context, z10);
        this.E = c71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c71 c71Var = this.E;
        n41 n41Var = c71Var.g0;
        t51 t51Var = c71Var.f0;
        c61 c61Var = c71Var.U;
        if (c61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = n41Var.getX() + t51Var.getX();
            float y3 = n41Var.getY() + t51Var.getY();
            rg.x xVar = (rg.x) c61Var;
            zg.b0 b0Var = (zg.b0) xVar.b;
            zg.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.sk0 sk0Var = (org.telegram.ui.Components.sk0) xVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            sk0Var.getDelegate().n(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - AndroidUtilities.statusBarHeight : a0Var.getY() + b0Var.c.getY()) + y3, 255, true);
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
