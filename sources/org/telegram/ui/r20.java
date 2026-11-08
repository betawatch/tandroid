package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r20 extends fr0 {
    public final /* synthetic */ c40 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(c40 c40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = c40Var;
    }

    @Override // org.telegram.ui.fr0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        c40 c40Var = this.T;
        b20 b20Var = c40Var.i1;
        c20 c20Var = c40Var.t4;
        if (f10 > 0.0f) {
            float x10 = c40Var.b.getX() + c20Var.getX();
            float y10 = c40Var.b.getY() + c20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, b20Var.getMeasuredWidth() + x10, b20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            c20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.fr0
    public final void e() {
        b20 b20Var = this.T.i1;
        super.e();
        for (int i7 = 0; i7 < b20Var.getChildCount(); i7++) {
            b20Var.getChildAt(i7).invalidate();
        }
    }
}
