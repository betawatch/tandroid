package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class sk extends hv0 {
    public sk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.hv0
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        if (f7 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                int max = (int) Math.max(f12, f11);
                int min = (int) Math.min(f13, u1Var.getMeasuredHeight() + f11);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, max, u1Var.getMeasuredWidth() + f10, min);
                canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
                canvas.translate(f10, f11 + u1Var.getPaddingTop());
                u1Var.Ed = true;
                u1Var.Y1(canvas);
                if (u1Var.f4() && u1Var.getCurrentMessagesGroup() == null) {
                    u1Var.m2(1.0f, canvas, false);
                }
                u1Var.Ed = false;
                canvas.restore();
            }
        }
    }
}
