package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tg0 implements og.g {
    public final /* synthetic */ wg0 a;

    public /* synthetic */ tg0(wg0 wg0Var) {
        this.a = wg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // og.g
    public void P(g.x xVar) {
        wg0 wg0Var = this.a;
        RectF rectF = wg0Var.R;
        xVar.a(wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = wg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((hh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && vg.i.c(view, wg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < wg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof vg0) && ((vg0) p2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(p2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // og.g
    public void i(Canvas canvas) {
        tg.d y10;
        Canvas canvas2;
        wg0 wg0Var = this.a;
        RectF rectF = wg0Var.R;
        int measuredWidth = wg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = wg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        SparseArray sparseArray = wg0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((hh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && vg.i.c(view, wg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < wg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof vg0) && (y10 = ((vg0) p2Var).y()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.I(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }
}
