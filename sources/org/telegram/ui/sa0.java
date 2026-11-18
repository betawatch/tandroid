package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ sa0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ee0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.c.setAlpha(floatValue);
                ee0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                break;
            case 1:
                ee0 ee0Var2 = this.b;
                ee0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                ee0Var2.W.setScaleX(f10);
                ee0Var2.W.setScaleY(f10);
                ee0Var2.W.setAlpha(floatValue2);
                break;
            default:
                ee0 ee0Var3 = this.b;
                ee0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var3.c.setAlpha(floatValue3);
                ee0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                break;
        }
    }
}
