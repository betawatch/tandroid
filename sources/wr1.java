// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wr1 extends de8 {
    @Override // de8
    public final void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        if (f > 0.0f) {
            ViewGroup viewGroup = this.e;
            if (viewGroup instanceof wb2) {
                wb2 wb2Var = (wb2) viewGroup;
                int max = (int) Math.max(f4, f3);
                int min = (int) Math.min(f5, wb2Var.getMeasuredHeight() + f3);
                RectF rectF = hl.P;
                rectF.set(f2, max, wb2Var.getMeasuredWidth() + f2, min);
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                canvas.translate(f2, f3 + wb2Var.getPaddingTop());
                wb2Var.Yb = true;
                wb2Var.j1(canvas);
                if (wb2Var.I3() && wb2Var.getCurrentMessagesGroup() == null) {
                    wb2Var.A1(1.0f, canvas, false);
                }
                wb2Var.Yb = false;
                canvas.restore();
            }
        }
    }
}
