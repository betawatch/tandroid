// default package

import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ox8 extends r59 {
    public kz2 f3;
    public by8 g3;

    @Override // r59, android.view.ViewGroup, android.view.View
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
        kz2 kz2Var = this.f3;
        if (kz2Var != null) {
            kz2Var.x(canvas2);
        }
        super.dispatchDraw(canvas2);
        by8 by8Var = this.g3;
        if (by8Var != null) {
            by8Var.x(canvas2);
            canvas2.restoreToCount(i);
        }
    }
}
