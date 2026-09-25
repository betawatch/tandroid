package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class rb extends org.telegram.ui.Components.aw0 {
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
        if (ubVar.v.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, ubVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, ubVar.v.getY());
        ubVar.v.getClass();
        for (int i10 = 0; i10 < ubVar.v.getChildCount(); i10++) {
            View childAt = ubVar.v.getChildAt(i10);
            RectF rectF2 = ubVar.P0;
            if (rectF == null || ubVar.v == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), ubVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), ubVar.v.getY() + childAt.getY() + childAt.getHeight());
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
                    ubVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (u1Var.U2()) {
                        canvas.save();
                        canvas.translate(u1Var.getX(), u1Var.getY());
                        u1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    ubVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                    canvas.restore();
                } else {
                    ubVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        ubVar.v.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
