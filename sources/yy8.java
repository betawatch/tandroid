// default package

import android.graphics.Canvas;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yy8 extends d79 {
    public vy2 f3;
    public lz8 g3;

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        if (this.g3 != null) {
            canvas2 = canvas;
            i = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i = -1;
        }
        vy2 vy2Var = this.f3;
        if (vy2Var != null) {
            vy2Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        lz8 lz8Var = this.g3;
        if (lz8Var != null) {
            lz8Var.x(canvas2);
            canvas2.restoreToCount(i);
        }
    }
}
