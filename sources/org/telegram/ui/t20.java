package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t20 extends hr0 {
    public final /* synthetic */ e40 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(e40 e40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = e40Var;
    }

    @Override // org.telegram.ui.hr0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        e40 e40Var = this.T;
        d20 d20Var = e40Var.i1;
        e20 e20Var = e40Var.t4;
        if (f10 > 0.0f) {
            float x10 = e40Var.b.getX() + e20Var.getX();
            float y10 = e40Var.b.getY() + e20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, d20Var.getMeasuredWidth() + x10, d20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            e20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.hr0
    public final void e() {
        d20 d20Var = this.T.i1;
        super.e();
        for (int i7 = 0; i7 < d20Var.getChildCount(); i7++) {
            d20Var.getChildAt(i7).invalidate();
        }
    }
}
