package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uk extends qs0 {
    public uk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.qs0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        if (f7 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                int max = (int) Math.max(f12, f11);
                int min = (int) Math.min(f13, q1Var.getMeasuredHeight() + f11);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f10, max, q1Var.getMeasuredWidth() + f10, min);
                canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
                canvas.translate(f10, f11 + q1Var.getPaddingTop());
                q1Var.Kb = true;
                q1Var.h1(canvas);
                if (q1Var.B3() && q1Var.getCurrentMessagesGroup() == null) {
                    q1Var.v1(1.0f, canvas, false);
                }
                q1Var.Kb = false;
                canvas.restore();
            }
        }
    }
}
