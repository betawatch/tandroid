package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u40 extends rv0 {
    public final /* synthetic */ k60 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(k60 k60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = k60Var;
    }

    @Override // org.telegram.ui.rv0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        k60 k60Var = this.T;
        e40 e40Var = k60Var.b;
        f40 f40Var = k60Var.C2;
        if (f7 > 0.0f) {
            float x10 = f40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = f40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, e40Var.getMeasuredWidth() + x11, e40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            f40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.rv0
    public final void e() {
        e40 e40Var = this.T.b;
        super.e();
        for (int i10 = 0; i10 < e40Var.getChildCount(); i10++) {
            e40Var.getChildAt(i10).invalidate();
        }
    }
}
