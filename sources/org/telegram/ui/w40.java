package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w40 extends wv0 {
    public final /* synthetic */ n60 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(n60 n60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = n60Var;
    }

    @Override // org.telegram.ui.wv0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n60 n60Var = this.T;
        g40 g40Var = n60Var.b;
        h40 h40Var = n60Var.C2;
        if (f7 > 0.0f) {
            float x10 = h40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = h40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, g40Var.getMeasuredWidth() + x11, g40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            h40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.wv0
    public final void e() {
        g40 g40Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < g40Var.getChildCount(); i10++) {
            g40Var.getChildAt(i10).invalidate();
        }
    }
}
