// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sx0 extends FrameLayout implements ey0 {
    public final ey0 a;

    public sx0(ey0 ey0Var) {
        super(ey0Var.getContext());
        this.a = ey0Var;
    }

    @Override // ey0
    public RectF getRect() {
        return this.a.getRect();
    }

    @Override // ey0
    public void setDrawingFromOverlay(boolean z) {
        this.a.setDrawingFromOverlay(z);
    }

    @Override // ey0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        return this.a.y(canvas, rectF, f, rectF2, f2);
    }
}
