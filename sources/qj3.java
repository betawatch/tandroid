// default package

import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qj3 extends um {
    @Override // um, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(gm.L(-2.0f), gm.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
