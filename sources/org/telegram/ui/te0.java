package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ we0 b;

    public /* synthetic */ te0(we0 we0Var, int i10) {
        this.a = i10;
        this.b = we0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                we0 we0Var = this.b;
                we0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var.d.setAlpha(floatValue);
                we0Var.e.setAlpha(floatValue);
                we0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = we0Var.x;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                we0 we0Var2 = this.b;
                we0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var2.f.setProgress(floatValue2);
                we0Var2.d.setAlpha(floatValue2);
                we0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = we0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
