// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class tg1 extends ela {
    public final /* synthetic */ vg1 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg1(vg1 vg1Var, Context context) {
        super(context, null);
        this.m0 = vg1Var;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        vg1 vg1Var = this.m0;
        if (vg1Var.w.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, vg1Var.w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, vg1Var.w.getY());
        vg1Var.w.getClass();
        int i = 0;
        while (true) {
            int childCount = vg1Var.w.getChildCount();
            fv fvVar = vg1Var.w;
            if (i >= childCount) {
                fvVar.getClass();
                canvas.restore();
                return;
            }
            View childAt = fvVar.getChildAt(i);
            RectF rectF2 = vg1Var.P0;
            if (rectF == null || vg1Var.w == null || childAt == null) {
                z = false;
            } else {
                rectF2.set(childAt.getX(), vg1Var.w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), vg1Var.w.getY() + childAt.getY() + childAt.getHeight());
                z = !rectF2.intersect(rectF);
            }
            if (!z) {
                if (childAt instanceof rc2) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    rc2 rc2Var = (rc2) childAt;
                    if (rc2Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, rc2Var.W);
                        rc2Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    vg1Var.w.drawChild(canvas, childAt, uptimeMillis);
                    if (rc2Var.l2()) {
                        canvas.save();
                        canvas.translate(rc2Var.getX(), rc2Var.getY());
                        rc2Var.i1(canvas);
                        canvas.restore();
                    }
                } else {
                    boolean z2 = childAt instanceof cm1;
                    fv fvVar2 = vg1Var.w;
                    if (z2) {
                        fvVar2.drawChild(canvas, childAt, uptimeMillis);
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        ((cm1) childAt).H(canvas);
                        canvas.restore();
                    } else {
                        fvVar2.drawChild(canvas, childAt, uptimeMillis);
                    }
                }
            }
            i++;
        }
    }
}
