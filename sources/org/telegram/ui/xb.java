package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class xb extends org.telegram.ui.Components.ow0 {
    public final /* synthetic */ ac w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(ac acVar, Context context) {
        super(context, null);
        this.w0 = acVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        ac acVar = this.w0;
        if (acVar.v.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, acVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, acVar.v.getY());
        acVar.v.getClass();
        for (int i10 = 0; i10 < acVar.v.getChildCount(); i10++) {
            View childAt = acVar.v.getChildAt(i10);
            RectF rectF2 = acVar.P0;
            if (rectF == null || acVar.v == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), acVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), acVar.v.getY() + childAt.getY() + childAt.getHeight());
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
                    acVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (u1Var.U2()) {
                        canvas.save();
                        canvas.translate(u1Var.getX(), u1Var.getY());
                        u1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    acVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).C(canvas);
                    canvas.restore();
                } else {
                    acVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        acVar.v.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ow0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
