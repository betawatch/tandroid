package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ sa0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                de0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.c.setAlpha(floatValue);
                de0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                break;
            case 1:
                de0 de0Var2 = this.b;
                de0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                de0Var2.W.setScaleX(f10);
                de0Var2.W.setScaleY(f10);
                de0Var2.W.setAlpha(floatValue2);
                break;
            default:
                de0 de0Var3 = this.b;
                de0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var3.c.setAlpha(floatValue3);
                de0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                break;
        }
    }
}
