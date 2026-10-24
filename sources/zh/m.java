package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m extends mm0 {
    public e0 Y2;
    public d0 Z2;

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.Z2 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        e0 e0Var = this.Y2;
        if (e0Var != null) {
            e0Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        d0 d0Var = this.Z2;
        if (d0Var != null) {
            d0Var.x(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
