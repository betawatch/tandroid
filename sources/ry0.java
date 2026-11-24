// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ry0 extends FrameLayout implements dz0 {
    public final dz0 a;

    public ry0(dz0 dz0Var) {
        super(dz0Var.getContext());
        this.a = dz0Var;
    }

    @Override // dz0
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // dz0
    public void setDrawingFromOverlay(boolean z) {
        this.a.setDrawingFromOverlay(z);
    }

    @Override // dz0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        return this.a.y(canvas, rectF, f, rectF2, f2);
    }
}
