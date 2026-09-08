package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class rb extends org.telegram.ui.Components.ov0 {
    public final /* synthetic */ ub w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(ub ubVar, Context context) {
        super(context, null);
        this.w0 = ubVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        ub ubVar = this.w0;
        if (ubVar.E.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, ubVar.E, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, ubVar.E.getY());
        ubVar.E.getClass();
        for (int i10 = 0; i10 < ubVar.E.getChildCount(); i10++) {
            View childAt = ubVar.E.getChildAt(i10);
            RectF rectF2 = ubVar.W0;
            if (rectF == null || ubVar.E == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), ubVar.E.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), ubVar.E.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, t1Var.V);
                        t1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    ubVar.E.drawChild(canvas, childAt, uptimeMillis);
                    if (t1Var.U2()) {
                        canvas.save();
                        canvas.translate(t1Var.getX(), t1Var.getY());
                        t1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    ubVar.E.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    ubVar.E.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        ubVar.E.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
