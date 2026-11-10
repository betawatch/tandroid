package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ az0 b;

    public /* synthetic */ xy0(az0 az0Var, int i7) {
        this.a = i7;
        this.b = az0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                az0 az0Var = this.b;
                az0Var.getClass();
                az0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.g();
                break;
            case 1:
                az0 az0Var2 = this.b;
                az0Var2.getClass();
                az0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var2.g();
                break;
            default:
                az0 az0Var3 = this.b;
                az0Var3.getClass();
                az0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var3.g();
                break;
        }
    }
}
