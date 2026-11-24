// default package

import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yya extends iza {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(cmb.w0(null, cmb.c6, false));
        }
        super.onDraw(canvas);
    }
}
