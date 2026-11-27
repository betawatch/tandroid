// default package

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xmc extends View {
    public wna a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wna wnaVar;
        if (this.b || (wnaVar = this.a) == null) {
            return;
        }
        wnaVar.b(canvas, this);
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}
