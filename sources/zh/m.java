package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class m extends im0 {
    public e0 V2;
    public d0 W2;

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.W2 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        e0 e0Var = this.V2;
        if (e0Var != null) {
            e0Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        d0 d0Var = this.W2;
        if (d0Var != null) {
            d0Var.x(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
