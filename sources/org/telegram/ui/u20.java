package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u20 extends ir0 {
    public final /* synthetic */ f40 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(f40 f40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = f40Var;
    }

    @Override // org.telegram.ui.ir0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        f40 f40Var = this.T;
        e20 e20Var = f40Var.l1;
        f20 f20Var = f40Var.w4;
        if (f10 > 0.0f) {
            float x10 = f40Var.b.getX() + f20Var.getX();
            float y10 = f40Var.b.getY() + f20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, e20Var.getMeasuredWidth() + x10, e20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            f20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ir0
    public final void e() {
        e20 e20Var = this.T.l1;
        super.e();
        for (int i7 = 0; i7 < e20Var.getChildCount(); i7++) {
            e20Var.getChildAt(i7).invalidate();
        }
    }
}
