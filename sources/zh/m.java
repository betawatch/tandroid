package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m extends im0 {
    public z V2;
    public y W2;

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
        z zVar = this.V2;
        if (zVar != null) {
            zVar.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        y yVar = this.W2;
        if (yVar != null) {
            yVar.x(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
