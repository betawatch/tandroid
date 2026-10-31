package sg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q extends mj0 {
    public float m1;
    public long n1;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.n1);
        this.n1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.m1;
            if (f7 != 0.0f) {
                this.m1 = f1.v(min, 150.0f, f7, 0.0f);
                invalidate();
                if (this.m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.m1;
            if (f10 != 1.0f) {
                this.m1 = f1.e(min, 150.0f, f10, 1.0f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 8 || this.m1 == 0.0f) {
            return;
        }
        this.m1 = 0.0f;
    }
}
