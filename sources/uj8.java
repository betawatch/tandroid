// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uj8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yj8 b;

    public /* synthetic */ uj8(yj8 yj8Var, byte b) {
        this.a = b;
        this.b = yj8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yj8 yj8Var = this.b;
        switch (b) {
            case 0:
                yj8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj8Var.c.invalidate();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj8Var.I2.getLayoutParams().height = gm.U1(floatValue, yj8Var.J2[0].getHeight(), yj8Var.J2[1].getHeight());
                yj8Var.I2.requestLayout();
                break;
        }
    }
}
