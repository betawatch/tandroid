package qh;

import android.graphics.Canvas;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends tk0 {
    public b0 e3;
    public a0 f3;

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.f3 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        b0 b0Var = this.e3;
        if (b0Var != null) {
            b0Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        a0 a0Var = this.f3;
        if (a0Var != null) {
            a0Var.x(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
