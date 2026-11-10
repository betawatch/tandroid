package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ ua0(fe0 fe0Var, int i7) {
        this.a = i7;
        this.b = fe0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fe0 fe0Var = this.b;
                fe0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var.c.setAlpha(floatValue);
                fe0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                break;
            case 1:
                fe0 fe0Var2 = this.b;
                fe0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                fe0Var2.V.setScaleX(f10);
                fe0Var2.V.setScaleY(f10);
                fe0Var2.V.setAlpha(floatValue2);
                break;
            default:
                fe0 fe0Var3 = this.b;
                fe0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var3.c.setAlpha(floatValue3);
                fe0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                break;
        }
    }
}
