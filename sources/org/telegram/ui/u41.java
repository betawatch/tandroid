package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u41 extends s51 {
    public final /* synthetic */ d61 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(d61 d61Var, Context context, boolean z10) {
        super(d61Var, context, z10);
        this.A = d61Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d61 d61Var = this.A;
        n31 n31Var = d61Var.c0;
        u41 u41Var = d61Var.b0;
        d51 d51Var = d61Var.Q;
        if (d51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x4 = n31Var.getX() + u41Var.getX();
            float y8 = n31Var.getY() + u41Var.getY();
            kg.w wVar = (kg.w) d51Var;
            kg.d0 d0Var = (kg.d0) wVar.b;
            kg.c0 c0Var = d0Var.a;
            org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) wVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f9 = 0;
            rectF.set(f9, f9, measuredWidth, measuredHeight);
            fk0Var.getDelegate().G(canvas, rectF, 0.0f, c0Var.getX() + x4, (d0Var.y == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY()) + y8, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            if (this.A.Q != null) {
                invalidate();
            }
        }
    }
}
