package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                f1Var.y2 = floatValue;
                f1Var.c.invalidate();
                break;
            default:
                f1 f1Var2 = this.b;
                f1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var2.F2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, f1Var2.G2[0].getHeight(), f1Var2.G2[1].getHeight());
                f1Var2.F2.requestLayout();
                break;
        }
    }
}
