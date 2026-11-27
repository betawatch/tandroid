// default package

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
