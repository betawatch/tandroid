package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class ub extends org.telegram.ui.Components.jw0 {
    public final /* synthetic */ xb w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(xb xbVar, Context context) {
        super(context, null);
        this.w0 = xbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        xb xbVar = this.w0;
        if (xbVar.v.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, xbVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, xbVar.v.getY());
        xbVar.v.getClass();
        for (int i10 = 0; i10 < xbVar.v.getChildCount(); i10++) {
            View childAt = xbVar.v.getChildAt(i10);
            RectF rectF2 = xbVar.P0;
            if (rectF == null || xbVar.v == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), xbVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), xbVar.v.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, u1Var.V);
                        u1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    xbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (u1Var.U2()) {
                        canvas.save();
                        canvas.translate(u1Var.getX(), u1Var.getY());
                        u1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                    xbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.x0) childAt).B(canvas);
                    canvas.restore();
                } else {
                    xbVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        xbVar.v.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.jw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
