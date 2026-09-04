package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vk extends ov0 {
    public vk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.ov0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        if (f7 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                int max = (int) Math.max(f12, f11);
                int min = (int) Math.min(f13, t1Var.getMeasuredHeight() + f11);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, max, t1Var.getMeasuredWidth() + f10, min);
                canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
                canvas.translate(f10, f11 + t1Var.getPaddingTop());
                t1Var.Ed = true;
                t1Var.Y1(canvas);
                if (t1Var.f4() && t1Var.getCurrentMessagesGroup() == null) {
                    t1Var.m2(1.0f, canvas, false);
                }
                t1Var.Ed = false;
                canvas.restore();
            }
        }
    }
}
