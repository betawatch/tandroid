package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yj extends fr0 {
    public yj(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.fr0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                int max = (int) Math.max(f13, f12);
                int min = (int) Math.min(f14, q1Var.getMeasuredHeight() + f12);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, max, q1Var.getMeasuredWidth() + f11, min);
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + q1Var.getPaddingTop());
                q1Var.Lb = true;
                q1Var.j1(canvas);
                if (q1Var.E3() && q1Var.getCurrentMessagesGroup() == null) {
                    q1Var.x1(1.0f, canvas, false);
                }
                q1Var.Lb = false;
                canvas.restore();
            }
        }
    }
}
