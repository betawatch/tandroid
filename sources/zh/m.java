package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class m extends jm0 {
    public e0 V2;
    public d0 W2;

    @Override // org.telegram.ui.Components.jm0, android.view.ViewGroup, android.view.View
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
