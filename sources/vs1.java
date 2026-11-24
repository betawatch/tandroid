// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vs1 extends pc8 {
    @Override // pc8
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof rc2) {
                rc2 rc2Var = (rc2) viewGroup;
                int max = (int) Math.max(f4, f3);
                int min = (int) Math.min(f5, rc2Var.getMeasuredHeight() + f3);
                RectF rectF = gm.P;
                rectF.set(f2, max, rc2Var.getMeasuredWidth() + f2, min);
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + rc2Var.getPaddingTop());
                rc2Var.Yb = true;
                rc2Var.j1(canvas);
                if (rc2Var.I3() && rc2Var.getCurrentMessagesGroup() == null) {
                    rc2Var.A1(1.0f, canvas, false);
                }
                rc2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
