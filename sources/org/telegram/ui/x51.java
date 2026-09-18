package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class x51 extends v61 {
    public final /* synthetic */ g71 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(g71 g71Var, Context context, boolean z10) {
        super(g71Var, context, z10);
        this.E = g71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g71 g71Var = this.E;
        r41 r41Var = g71Var.g0;
        x51 x51Var = g71Var.f0;
        g61 g61Var = g71Var.U;
        if (g61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = r41Var.getX() + x51Var.getX();
            float y3 = r41Var.getY() + x51Var.getY();
            s5.e eVar = (s5.e) g61Var;
            zg.b0 b0Var = (zg.b0) eVar.b;
            zg.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) eVar.c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            qk0Var.getDelegate().n(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - AndroidUtilities.statusBarHeight : a0Var.getY() + b0Var.c.getY()) + y3, 255, true);
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
