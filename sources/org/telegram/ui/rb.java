package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class rb extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ ub t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(ub ubVar, Context context) {
        super(context, null);
        this.t0 = ubVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z4;
        long uptimeMillis = SystemClock.uptimeMillis();
        ub ubVar = this.t0;
        if (ubVar.B.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, ubVar.B, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, ubVar.B.getY());
        ubVar.B.getClass();
        for (int i10 = 0; i10 < ubVar.B.getChildCount(); i10++) {
            View childAt = ubVar.B.getChildAt(i10);
            RectF rectF2 = ubVar.T0;
            if (rectF == null || ubVar.B == null || childAt == null) {
                z4 = false;
            } else {
                rectF2.set(childAt.getX(), ubVar.B.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), ubVar.B.getY() + childAt.getY() + childAt.getHeight());
                z4 = !rectF2.intersect(rectF);
            }
            if (!z4) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, s1Var.S);
                        s1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    ubVar.B.drawChild(canvas, childAt, uptimeMillis);
                    if (s1Var.U2()) {
                        canvas.save();
                        canvas.translate(s1Var.getX(), s1Var.getY());
                        s1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    ubVar.B.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    ubVar.B.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        ubVar.B.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
