package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class tb extends org.telegram.ui.Components.ww0 {
    public final /* synthetic */ wb l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(wb wbVar, Context context) {
        super(context, null);
        this.l0 = wbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        wb wbVar = this.l0;
        if (wbVar.v.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, wbVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, wbVar.v.getY());
        wbVar.v.getClass();
        for (int i10 = 0; i10 < wbVar.v.getChildCount(); i10++) {
            View childAt = wbVar.v.getChildAt(i10);
            RectF rectF2 = wbVar.P0;
            if (rectF == null || wbVar.v == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), wbVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), wbVar.v.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, s1Var.V);
                        s1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (s1Var.U2()) {
                        canvas.save();
                        canvas.translate(s1Var.getX(), s1Var.getY());
                        s1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        wbVar.v.getClass();
        canvas.restore();
    }
}
