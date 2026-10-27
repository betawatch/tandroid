package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wd1 extends FrameLayout {
    public ValueAnimator a;
    public boolean b;
    public float c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.c;
            if (f10 != 1.0f) {
                this.c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.b != z10) {
            this.b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.a) != null) {
                valueAnimator.removeAllListeners();
                this.a.cancel();
            }
            if (z10) {
                return;
            }
            float f7 = this.c;
            if (f7 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new x11(this, 13));
                this.a.addListener(new hc1(this, 1));
                d3.m(5.0f, this.a);
                this.a.setDuration(350L);
                this.a.start();
            }
        }
    }
}
