package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class sb extends org.telegram.ui.Components.bw0 {
    public final /* synthetic */ vb w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(vb vbVar, Context context) {
        super(context, null);
        this.w0 = vbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        vb vbVar = this.w0;
        if (vbVar.v.a1()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, vbVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, vbVar.v.getY());
        vbVar.v.getClass();
        for (int i10 = 0; i10 < vbVar.v.getChildCount(); i10++) {
            View childAt = vbVar.v.getChildAt(i10);
            RectF rectF2 = vbVar.P0;
            if (rectF == null || vbVar.v == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), vbVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), vbVar.v.getY() + childAt.getY() + childAt.getHeight());
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
                    vbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (u1Var.U2()) {
                        canvas.save();
                        canvas.translate(u1Var.getX(), u1Var.getY());
                        u1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    vbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                    canvas.restore();
                } else {
                    vbVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        vbVar.v.getClass();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.bw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
