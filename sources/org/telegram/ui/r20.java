package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r20 extends dr0 {
    public final /* synthetic */ c40 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(c40 c40Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = c40Var;
    }

    @Override // org.telegram.ui.dr0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        c40 c40Var = this.T;
        a20 a20Var = c40Var.m1;
        b20 b20Var = c40Var.B4;
        if (f10 > 0.0f) {
            float x10 = c40Var.b.getX() + b20Var.getX();
            float y10 = c40Var.b.getY() + b20Var.getY();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(x10, y10, a20Var.getMeasuredWidth() + x10, a20Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x10, y10);
            b20Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.dr0
    public final void e() {
        a20 a20Var = this.T.m1;
        super.e();
        for (int i7 = 0; i7 < a20Var.getChildCount(); i7++) {
            a20Var.getChildAt(i7).invalidate();
        }
    }
}
