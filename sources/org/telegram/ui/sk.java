package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sk extends xu0 {
    public sk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override // org.telegram.ui.xu0
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                int max = (int) Math.max(f13, f12);
                int min = (int) Math.min(f14, t1Var.getMeasuredHeight() + f12);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, max, t1Var.getMeasuredWidth() + f11, min);
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + t1Var.getPaddingTop());
                t1Var.Bd = true;
                t1Var.Y1(canvas);
                if (t1Var.f4() && t1Var.getCurrentMessagesGroup() == null) {
                    t1Var.m2(1.0f, canvas, false);
                }
                t1Var.Bd = false;
                canvas.restore();
            }
        }
    }
}
