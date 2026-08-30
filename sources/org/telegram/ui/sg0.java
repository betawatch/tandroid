package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sg0 implements ng.g {
    public final /* synthetic */ vg0 a;

    public /* synthetic */ sg0(vg0 vg0Var) {
        this.a = vg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.g
    public void Y(g.x xVar) {
        vg0 vg0Var = this.a;
        RectF rectF = vg0Var.R;
        xVar.a(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = vg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((fh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && ug.i.c(view, vg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < vg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof ug0) && ((ug0) p2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(p2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.g
    public void k(Canvas canvas) {
        sg.d y10;
        Canvas canvas2;
        vg0 vg0Var = this.a;
        RectF rectF = vg0Var.R;
        int measuredWidth = vg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = vg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        SparseArray sparseArray = vg0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((fh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && ug.i.c(view, vg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < vg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof ug0) && (y10 = ((ug0) p2Var).y()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.X(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }
}
