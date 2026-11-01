package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve0 b;

    public /* synthetic */ se0(ve0 ve0Var, int i10) {
        this.a = i10;
        this.b = ve0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ve0 ve0Var = this.b;
                ve0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.d.setAlpha(floatValue);
                ve0Var.e.setAlpha(floatValue);
                ve0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = ve0Var.x;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                ve0 ve0Var2 = this.b;
                ve0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.f.setProgress(floatValue2);
                ve0Var2.d.setAlpha(floatValue2);
                ve0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = ve0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
