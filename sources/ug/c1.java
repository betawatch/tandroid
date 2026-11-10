package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ c1(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1 f1Var = this.b;
                f1Var.B2 = floatValue;
                f1Var.c.invalidate();
                break;
            default:
                f1 f1Var2 = this.b;
                f1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var2.I2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, f1Var2.J2[0].getHeight(), f1Var2.J2[1].getHeight());
                f1Var2.I2.requestLayout();
                break;
        }
    }
}
