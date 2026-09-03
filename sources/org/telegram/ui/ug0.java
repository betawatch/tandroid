package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ug0 implements ng.g {
    public final /* synthetic */ xg0 a;

    public /* synthetic */ ug0(xg0 xg0Var) {
        this.a = xg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.g
    public void D(Canvas canvas) {
        sg.d y10;
        Canvas canvas2;
        xg0 xg0Var = this.a;
        RectF rectF = xg0Var.R;
        int measuredWidth = xg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = xg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        SparseArray sparseArray = xg0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((nh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && ug.i.c(view, xg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < xg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof wg0) && (y10 = ((wg0) p2Var).y()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.H(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.g
    public void D1(g.x xVar) {
        xg0 xg0Var = this.a;
        RectF rectF = xg0Var.R;
        xVar.a(xg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = xg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((nh1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && ug.i.c(view, xg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < xg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof wg0) && ((wg0) p2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(p2Var.getClassGuid());
            }
        }
    }
}
