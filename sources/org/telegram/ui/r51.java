package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class r51 extends p61 {
    public final /* synthetic */ a71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(a71 a71Var, Context context, boolean z10) {
        super(a71Var, context, z10);
        this.E = a71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a71 a71Var = this.E;
        l41 l41Var = a71Var.g0;
        r51 r51Var = a71Var.f0;
        a61 a61Var = a71Var.U;
        if (a61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l41Var.getX() + r51Var.getX();
            float y3 = l41Var.getY() + r51Var.getY();
            rg.x xVar = (rg.x) a61Var;
            zg.z zVar = (zg.z) xVar.b;
            zg.y yVar = zVar.a;
            org.telegram.ui.Components.sk0 sk0Var = (org.telegram.ui.Components.sk0) xVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            sk0Var.getDelegate().H(canvas, rectF, 0.0f, yVar.getX() + x10, (zVar.y == 1 ? yVar.getY() - AndroidUtilities.statusBarHeight : yVar.getY() + zVar.c.getY()) + y3, 255, true);
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
