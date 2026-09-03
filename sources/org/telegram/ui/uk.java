package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uk extends cv0 {
    public uk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.cv0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                int max = (int) Math.max(f13, f12);
                int min = (int) Math.min(f14, s1Var.getMeasuredHeight() + f12);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, max, s1Var.getMeasuredWidth() + f11, min);
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + s1Var.getPaddingTop());
                s1Var.Bd = true;
                s1Var.Y1(canvas);
                if (s1Var.f4() && s1Var.getCurrentMessagesGroup() == null) {
                    s1Var.m2(1.0f, canvas, false);
                }
                s1Var.Bd = false;
                canvas.restore();
            }
        }
    }
}
