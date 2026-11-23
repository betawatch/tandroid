package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ e1(h1 h1Var, int i7) {
        this.a = i7;
        this.b = h1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var = this.b;
                h1Var.C2 = floatValue;
                h1Var.c.invalidate();
                break;
            default:
                h1 h1Var2 = this.b;
                h1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, h1Var2.K2[0].getHeight(), h1Var2.K2[1].getHeight());
                h1Var2.J2.requestLayout();
                break;
        }
    }
}
