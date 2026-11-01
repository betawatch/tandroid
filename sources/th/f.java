package th;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f extends org.telegram.ui.Components.e5 {
    @Override // org.telegram.ui.Components.e5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
