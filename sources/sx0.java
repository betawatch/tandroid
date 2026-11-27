// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
