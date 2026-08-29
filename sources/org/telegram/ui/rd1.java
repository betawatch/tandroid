package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rd1 extends FrameLayout {
    public ValueAnimator a;
    public boolean b;
    public float c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f9 = ((1.0f - this.c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f9, f9, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
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
            float f9 = this.c;
            if (f9 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new w01(this, 16));
                this.a.addListener(new cc1(this, 1));
                this.a.setInterpolator(new OvershootInterpolator(5.0f));
                this.a.setDuration(350L);
                this.a.start();
            }
        }
    }
}
