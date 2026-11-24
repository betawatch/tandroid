// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;

    public /* synthetic */ zu7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                xv7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.R1 = floatValue;
                xv7Var.P1.setTransitionProgress(floatValue);
                break;
        }
    }
}
