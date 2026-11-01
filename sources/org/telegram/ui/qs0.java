package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ qs0(zs0 zs0Var, int i10) {
        this.a = i10;
        this.b = zs0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zs0 zs0Var = this.b;
                zs0Var.getClass();
                zs0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zs0 zs0Var2 = this.b;
                zs0Var2.getClass();
                zs0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
