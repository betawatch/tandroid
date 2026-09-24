package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        m51 m51Var = a71Var.g0;
        r51 r51Var = a71Var.f0;
        a61 a61Var = a71Var.U;
        if (a61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = m51Var.getX() + r51Var.getX();
            float y3 = m51Var.getY() + r51Var.getY();
            s5.e eVar = (s5.e) a61Var;
            zg.b0 b0Var = (zg.b0) eVar.b;
            zg.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) eVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            qk0Var.getDelegate().m(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - AndroidUtilities.statusBarHeight : a0Var.getY() + b0Var.c.getY()) + y3, 255, true);
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
