package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ zb0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                gf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf0Var.c.setAlpha(floatValue);
                gf0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(230.0f));
                break;
            case 1:
                gf0 gf0Var2 = this.b;
                gf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                gf0Var2.V.setScaleX(f7);
                gf0Var2.V.setScaleY(f7);
                gf0Var2.V.setAlpha(floatValue2);
                break;
            default:
                gf0 gf0Var3 = this.b;
                gf0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf0Var3.c.setAlpha(floatValue3);
                gf0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.i0.L(230.0f));
                break;
        }
    }
}
